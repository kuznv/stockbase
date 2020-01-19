package stockbase.interfaces.api.transaction;

import stockbase.interfaces.service.PaymentServiceException;

public class TransactionException extends PaymentServiceException {
    public TransactionException(String message) {
        super(message);
    }

    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionException(Throwable cause) {
        super(cause);
    }
}
