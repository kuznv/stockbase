package stockbase.impl.api.authorization;

import stockbase.interfaces.api.authorization.IAuthorizationRequest;

public class AuthorizationRequest implements IAuthorizationRequest {
    private final static String grantType = "client_credentials";
    private final String clientId;
    private final String clientSecret;

    public AuthorizationRequest(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override public String getGrantType() {
        return grantType;
    }

    @Override public String getClientId() {
        return clientId;
    }

    @Override public String getClientSecret() {
        return clientSecret;
    }
}
