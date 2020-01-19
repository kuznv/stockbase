package stockbase.impl.api.notification;

import stockbase.interfaces.api.notification.INotificationRequest;

public class NotificationRequest implements INotificationRequest {
    private final String signature;
    private final String clientTransactionId;
    private final String status;
    private final String address;
    private final String crypto;

    public NotificationRequest(String signature, String clientTransactionId, String status, String address, String crypto) {
        this.signature = signature;
        this.clientTransactionId = clientTransactionId;
        this.status = status;
        this.address = address;
        this.crypto = crypto;
    }

    @Override public String getSignature() {
        return signature;
    }

    @Override public String getClientTransactionId() {
        return clientTransactionId;
    }

    @Override public String getStatus() {
        return status;
    }

    @Override public String getAddress() {
        return address;
    }

    @Override public String getCrypto() {
        return crypto;
    }
}
