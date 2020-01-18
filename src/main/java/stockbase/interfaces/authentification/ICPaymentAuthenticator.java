package stockbase.interfaces.authentification;

import base.authentification.IPaymentAuthenticator;
import stockbase.interfaces.data.ICPaymentData;

public interface ICPaymentAuthenticator extends IPaymentAuthenticator<ICPaymentData, ICPaymentAuthenticationData, ICPaymentAuthenticatedData> {
}
