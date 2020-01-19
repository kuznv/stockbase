package stockbase.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.authentification.CAuthenticationData;
import stockbase.interfaces.api.authorization.IAuthorizationResponse;
import stockbase.interfaces.api.notification.NotificationException;
import stockbase.interfaces.authentification.ICAuthenticationData;
import stockbase.interfaces.service.IPaymentService;

import java.util.Random;

@SpringBootTest
class ApplicationTests {
    @Value("${test.clientId}")
    private String clientId;

    @Value("${test.clientSecret}")
    private String clientSecret;

    private IPaymentService paymentService;
    private ICAuthenticationData authenticationData;
    private String transactionId;

    private final AppRestController restController;

    @Autowired public ApplicationTests(IPaymentService paymentService, AppRestController restController) {
        this.paymentService = paymentService;
        this.restController = restController;
    }

    @Test
    @BeforeEach
    void authorizationTest() {
        AuthorizationRequest request = new AuthorizationRequest(clientId, clientSecret);
        IAuthorizationResponse authorizationResponse = paymentService.authorize(request);
        String accessToken = authorizationResponse.getAccessToken();
        Assertions.assertNotNull(accessToken);
        authenticationData = new CAuthenticationData(accessToken);
    }

    @Order(1)
    @Test
    void transactionTest() {
        transactionId = String.valueOf(new Random().nextInt());
        CreateTransactionRequest createTransaction = new CreateTransactionRequest("eth", 20.0, transactionId);
        paymentService.createTransaction(createTransaction, authenticationData);
    }

    @Order(2)
    @Test
    void notificationTest() throws NotificationException {
        NotificationResponse notificationResponse = restController.notify(
                "123",
                transactionId,
                "success",
                "123",
                "eth"
        );

        Assertions.assertEquals("success", notificationResponse.getResponse());
    }
}
