package stockbase.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.impl.api.authorization.AuthorizationResponse;
import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.api.transaction.CreateTransactionResponse;
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

    @Override public AuthorizationResponse authorize(AuthorizationRequest authorization) {
        return authorizationService.authorize(authorization);
    }

    @Override public CreateTransactionResponse createTransaction(CreateTransactionRequest createTransaction) {
        return transactionService.createTransaction(createTransaction);
    }

    @Override public NotificationResponse onNotificationRequest(NotificationRequest notification) {
        return notificationService.onNotificationRequest(notification);
    }
}
