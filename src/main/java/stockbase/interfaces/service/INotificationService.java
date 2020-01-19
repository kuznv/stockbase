package stockbase.interfaces.service;

import stockbase.impl.api.notification.NotificationRequest;
import stockbase.impl.api.notification.NotificationResponse;
import stockbase.interfaces.api.notification.NotificationException;

public interface INotificationService {
    NotificationResponse onNotificationRequest(NotificationRequest notification) throws NotificationException;
}
