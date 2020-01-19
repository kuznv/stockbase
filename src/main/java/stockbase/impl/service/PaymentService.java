package stockbase.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.api.transaction.CreateTransactionResponse;
import stockbase.interfaces.api.authorization.IAuthorizationResponse;
import stockbase.interfaces.api.notification.NotificationException;
import stockbase.interfaces.authentification.ICAuthenticationData;
import stockbase.interfaces.service.IPaymentService;

@Service
public class PaymentService implements IPaymentService {
    private final AuthorizationService authorizationService;
    private final TransactionService transactionService;
    private final NotificationService notificationService;

    @Autowired public PaymentService(AuthorizationService authorizationService,
                                     TransactionService transactionService,
                                     NotificationService notificationService) {
        this.authorizationService = authorizationService;
        this.transactionService = transactionService;
        this.notificationService = notificationService;
    }

    @Override public IAuthorizationResponse authorize(AuthorizationRequest authorization) {
        return authorizationService.authorize(authorization);
    }

    @Override public CreateTransactionResponse createTransaction(CreateTransactionRequest createTransaction, ICAuthenticationData authenticationData) {
        return transactionService.createTransaction(createTransaction, authenticationData);
    }

    @Override public NotificationResponse onNotificationRequest(NotificationRequest notification) throws NotificationException {
        return notificationService.onNotificationRequest(notification);
    }
}
