package stockbase.impl.service;

import org.springframework.stereotype.Service;
import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.impl.api.authorization.AuthorizationResponse;
import stockbase.interfaces.service.IAuthorizationService;

@Service
public class AuthorizationService implements IAuthorizationService {
    private static final String authAddress = "https://stg-gateway.stockbase.io/oauth/token";


    @Override public AuthorizationResponse authorize(AuthorizationRequest authorization) {
        return null;
    }
}