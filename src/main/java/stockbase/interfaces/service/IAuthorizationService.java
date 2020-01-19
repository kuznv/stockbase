package stockbase.interfaces.service;

import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.interfaces.api.authorization.IAuthorizationResponse;

public interface IAuthorizationService {
    IAuthorizationResponse authorize(AuthorizationRequest authorization);
}
