package stockbase.interfaces.authentification;

import base.authentification.IPaymentAuthenticatedData;
import stockbase.interfaces.data.ICPaymentData;

public interface ICPaymentAuthenticatedData extends IPaymentAuthenticatedData<ICPaymentData, ICPaymentAuthenticationData>, ICPaymentData, ICPaymentAuthenticationData {

}
