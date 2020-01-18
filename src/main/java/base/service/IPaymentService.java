package base.service;

import base.data.IPaymentData;

public interface IPaymentService {
    void pay(IPaymentData paymentData) throws PaymentServiceException;
}
