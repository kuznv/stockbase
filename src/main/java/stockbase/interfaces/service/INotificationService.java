package stockbase.interfaces.service;

import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;

public interface INotificationService {
    NotificationResponse onNotificationRequest(NotificationRequest notification);
}
