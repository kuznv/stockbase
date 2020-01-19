package stockbase.impl.service;

import org.springframework.stereotype.Service;
import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.interfaces.api.notification.NotificationException;
import stockbase.interfaces.service.INotificationService;

import java.util.Objects;

@Service
public class NotificationService implements INotificationService {

    @Override public NotificationResponse onNotificationRequest(NotificationRequest notification) throws NotificationException {
        if (Objects.equals("success", notification.getStatus())) { //TODO: check signature
            return new NotificationResponse();
        }
        throw new NotificationException(notification.getStatus());
    }
}