package stockbase.interfaces.api.notification;

public interface INotificationResponse {
    String getSignature();

    String getClientTransactionId();

    String getStatus();

    String getAddress();

    String getCrypto();
}
