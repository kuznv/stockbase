package base.service;

import base.data.IPaymentData;

public interface IPaymentService<D extends IPaymentData> {
    void pay(D paymentData) throws PaymentServiceException;
}
