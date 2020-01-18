package stockbase.impl.authentification;

import stockbase.interfaces.authentification.ICPaymentAuthenticationData;

public class CPaymentAuthenticationData implements ICPaymentAuthenticationData {
    private final String authorization;

    public CPaymentAuthenticationData(String authorization) {
        this.authorization = authorization;
    }

    @Override public String getAuthorization() {
        return authorization;
    }
}
