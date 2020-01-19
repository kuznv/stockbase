package stockbase.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.api.transaction.CreateTransactionResponse;
import stockbase.impl.authentification.CAuthenticationData;
import stockbase.interfaces.api.authorization.IAuthorizationResponse;
import stockbase.interfaces.service.IPaymentService;

import java.util.Random;

@Component
public class StartupListener {
    private final IPaymentService paymentService;

    public StartupListener(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) throws JsonProcessingException {
        String clientId = "o7MY4avygneErVqkR81mXz2p9QdbB30D";
        String clientSecret = "qtuxxPa3NA3MEfIlD2ZDsl7fAeJJe8DblzMIrlqd";
        AuthorizationRequest request = new AuthorizationRequest(clientId, clientSecret);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(request));
        IAuthorizationResponse authorizationResponse = paymentService.authorize(request);
        String accessToken = authorizationResponse.getAccessToken();
        String transactionId = String.valueOf(new Random().nextInt());
        CreateTransactionRequest createTransaction = new CreateTransactionRequest("eth", 20.0, transactionId);
        CreateTransactionResponse transaction = paymentService.createTransaction(createTransaction, new CAuthenticationData(accessToken));
        System.out.println(transaction);
    }
}