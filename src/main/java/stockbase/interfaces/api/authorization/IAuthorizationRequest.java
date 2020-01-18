package stockbase.interfaces.api.authorization;

public interface IAuthorizationRequest {
    String getGrantType();

    String getClientId();

    String getClientSecret();
}
