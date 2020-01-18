package stockbase.interfaces.authentification;

import base.authentification.IPaymentAuthenticationData;

public interface ICPaymentAuthenticationData extends IPaymentAuthenticationData {
    String getAuthorization();
}
