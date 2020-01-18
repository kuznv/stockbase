package base.validation;

import base.data.IPaymentData;

public interface IPaymentValidator<T extends IPaymentData> {
    public void validate(T paymentData) throws PaymentValidationException;
}