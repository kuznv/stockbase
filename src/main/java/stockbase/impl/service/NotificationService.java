package stockbase.impl.service;

import org.springframework.stereotype.Service;
import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.interfaces.service.INotificationService;

@Service
public class NotificationService implements INotificationService {

    @Override public NotificationResponse onNotificationRequest(NotificationRequest notification) {
        return null;
    }
}