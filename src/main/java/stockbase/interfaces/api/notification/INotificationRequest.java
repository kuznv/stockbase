package stockbase.interfaces.api.notification;

public interface INotificationRequest {
    String getSignature();

    String getClientTransactionId();

    String getStatus();

    String getAddress();

    String getCrypto();
}
