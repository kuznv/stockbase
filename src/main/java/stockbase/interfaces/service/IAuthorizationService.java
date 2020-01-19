package stockbase.interfaces.service;

import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.impl.api.authorization.AuthorizationResponse;

public interface IAuthorizationService {
    AuthorizationResponse authorize(AuthorizationRequest authorization);
}
