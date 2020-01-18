package stockbase.impl.authentification;

import stockbase.interfaces.authentification.ICPaymentAuthenticatedData;
import stockbase.interfaces.authentification.ICPaymentAuthenticationData;
import stockbase.interfaces.authentification.ICPaymentAuthenticator;
import stockbase.interfaces.data.ICPaymentData;

public class CPaymentAuthenticator implements ICPaymentAuthenticator {
    @Override public ICPaymentAuthenticatedData authenticate(ICPaymentData paymentData,
                                                             ICPaymentAuthenticationData authenticationData) {
        return new CPaymentAuthenticatedData(paymentData, authenticationData);
    }
}
