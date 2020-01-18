package base.authentification;


import base.data.IPaymentData;

public interface IPaymentAuthenticator<D extends IPaymentData, A extends IPaymentAuthenticationData, DA extends IPaymentAuthenticatedData<D, A>> {
    DA authenticate(D paymentData, A authenticationData);
}
