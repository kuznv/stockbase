package stockbase.interfaces.api.authorization;

import stockbase.interfaces.service.PaymentServiceException;

public class AuthorizationException extends PaymentServiceException {
    public AuthorizationException(String message) {
        super(message);
    }

    public AuthorizationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorizationException(Throwable cause) {
        super(cause);
    }
}
