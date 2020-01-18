package stockbase.interfaces.api.authorization;

public interface IAuthorizationResponse {
    String getTokenType();

    String getExpiresIn();

    String getAccessToken();
}
