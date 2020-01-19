package stockbase.impl.api.notification;

import stockbase.interfaces.api.notification.INotificationResponse;

public class NotificationResponse implements INotificationResponse {
    private final static String response = "success";

    @Override public String getResponse() {
        return response;
    }
}
