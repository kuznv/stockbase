package base.authentification;

import base.data.IPaymentData;

public class SimplePaymentAuthenticatedData<D extends IPaymentData, A extends IPaymentAuthenticationData> implements IPaymentAuthenticatedData<D, A> {

    private final D paymentData;
    private final A authenticationData;

    public SimplePaymentAuthenticatedData(D paymentData, A authenticationData) {
        this.paymentData = paymentData;
        this.authenticationData = authenticationData;
    }

    @Override public D getPaymentData() {
        return paymentData;
    }

    @Override public A getAuthenticationData() {
        return authenticationData;
    }
}
