package stockbase.interfaces.validation;

import base.validation.IPaymentValidator;
import stockbase.interfaces.data.ICPaymentData;

public interface ICPaymentValidator<T extends ICPaymentData> extends IPaymentValidator<T> {
    void validate(T paymentData) throws CPaymentValidationException;
}