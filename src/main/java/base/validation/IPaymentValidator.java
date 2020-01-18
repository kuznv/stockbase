package base.validation;

import base.data.IPaymentData;

public interface IPaymentValidator<D extends IPaymentData> {
    void validate(D paymentData) throws PaymentValidationException;
}