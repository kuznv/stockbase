package base.authentification;

import base.data.IPaymentData;

public interface IPaymentAuthenticatedData<D extends IPaymentData, A extends IPaymentAuthenticationData>
        extends IPaymentData, IPaymentAuthenticationData {

    D getPaymentData();

    A getAuthenticationData();
}
