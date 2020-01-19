package stockbase.impl.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import stockbase.impl.api.authorization.AuthorizationRequest;
import stockbase.impl.api.authorization.AuthorizationResponse;
import stockbase.interfaces.api.authorization.AuthorizationException;
import stockbase.interfaces.api.authorization.IAuthorizationResponse;
import stockbase.interfaces.service.IAuthorizationService;

@Service
@ConfigurationPropertiesBinding
public class AuthorizationService implements IAuthorizationService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final HttpHeaders httpHeaders;
    @Value("${service.authAddress}")
    private String authAddress;

    public AuthorizationService(HttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    @Override public IAuthorizationResponse authorize(AuthorizationRequest authorization) throws AuthorizationException {
        try {
            HttpEntity<AuthorizationRequest> httpEntity = new HttpEntity<>(authorization, httpHeaders);
            return restTemplate.exchange(authAddress, HttpMethod.POST, httpEntity, AuthorizationResponse.class).getBody();
        } catch (Exception e) {
            throw new AuthorizationException(e);
        }
    }
}