package crypto.api.request;

public class TokenRequest {
    private String grant_type = "client_credentials";
    private String client_id;
    private String client_secret;

    public TokenRequest(String clientId, String clientSecret) {
        this.client_id = clientId;
        this.client_secret = clientSecret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }
}
