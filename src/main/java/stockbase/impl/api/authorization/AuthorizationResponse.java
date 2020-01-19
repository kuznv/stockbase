package stockbase.impl.api.authorization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import stockbase.interfaces.api.authorization.IAuthorizationResponse;

public class AuthorizationResponse implements IAuthorizationResponse {
    private final String tokenType;
    private final String expiresIn;
    private final String accessToken;

    @JsonCreator
    public AuthorizationResponse(@JsonProperty("token_type") String tokenType,
                                 @JsonProperty("expires_in") String expiresIn,
                                 @JsonProperty("access_token") String accessToken) {
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
