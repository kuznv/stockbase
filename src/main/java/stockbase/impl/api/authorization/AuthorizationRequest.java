package stockbase.impl.api.authorization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import stockbase.interfaces.api.authorization.IAuthorizationRequest;

public class AuthorizationRequest implements IAuthorizationRequest {
    private final static String grantType = "client_credentials";
    private final String clientId;
    private final String clientSecret;

    @JsonCreator
    public AuthorizationRequest(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @JsonGetter("grant_type")
    @Override public String getGrantType() {
        return grantType;
    }

    @JsonGetter("client_id")
    @Override public String getClientId() {
        return clientId;
    }

    @JsonGetter("client_secret")
    @Override public String getClientSecret() {
        return clientSecret;
    }
}
