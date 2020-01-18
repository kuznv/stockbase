package stockbase.impl.authentification;

import stockbase.interfaces.authentification.ICAuthenticationData;

public class CAuthenticationData implements ICAuthenticationData {
    private final String authorization;

    public CAuthenticationData(String authorization) {
        this.authorization = authorization;
    }

    @Override public String getAuthorization() {
        return authorization;
    }
}
