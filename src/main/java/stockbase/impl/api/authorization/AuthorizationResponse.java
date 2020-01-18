package stockbase.impl.api.authorization;

import stockbase.interfaces.api.authorization.IAuthorizationResponse;

public class AuthorizationResponse implements IAuthorizationResponse {
    private final String tokenType;
    private final String expiresIn;
    private final String accessToken;

    public AuthorizationResponse(String tokenType, String expiresIn, String accessToken) {
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
        this.accessToken = accessToken;
    }

    @Override public String getTokenType() {
        return tokenType;
    }

    @Override public String getExpiresIn() {
        return expiresIn;
    }

    @Override public String getAccessToken() {
        return accessToken;
    }
}
