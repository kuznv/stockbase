package stockbase.interfaces.api.notification;

import stockbase.interfaces.service.PaymentServiceException;

public class NotificationException extends PaymentServiceException {
    public NotificationException(String message) {
        super(message);
    }

    public NotificationException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotificationException(Throwable cause) {
        super(cause);
    }
}
