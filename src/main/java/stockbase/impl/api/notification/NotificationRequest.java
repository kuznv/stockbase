package stockbase.impl.api.notification;

import stockbase.interfaces.api.notification.INotificationRequest;

public class NotificationRequest implements INotificationRequest {
    private final static String response = "success";

    @Override public String getResponse() {
        return response;
    }
}
