package stockbase.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.interfaces.api.notification.NotificationException;
import stockbase.interfaces.service.INotificationService;

@RestController
public class AppRestController {

    private final INotificationService notificationService;

    public AppRestController(INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/notify")
    public NotificationResponse notify(@RequestHeader("Signature") String signature,
                                       @RequestParam("client_transaction_id") String clientTransactionId,
                                       @RequestParam String status,
                                       @RequestParam String address,
                                       @RequestParam String crypto) throws NotificationException {
        NotificationRequest notificationRequest = new NotificationRequest(signature, clientTransactionId, status, address, crypto);
        return notificationService.onNotificationRequest(notificationRequest);
    }
}
