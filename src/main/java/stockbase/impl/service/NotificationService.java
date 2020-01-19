package stockbase.impl.service;

import org.springframework.stereotype.Service;
import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.interfaces.api.notification.NotificationException;
import stockbase.interfaces.service.INotificationService;

@Service
public class NotificationService implements INotificationService {

    @Override public NotificationResponse onNotificationRequest(NotificationRequest notification) throws NotificationException {
        if (notification.getStatus().equals("success")) { //TODO: check signature
            return new NotificationResponse();
        }
        throw new NotificationException(notification.getStatus());
    }
}