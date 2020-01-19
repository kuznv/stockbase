package stockbase.impl.authentification;

import org.springframework.stereotype.Service;
import stockbase.interfaces.authentification.ICAuthenticatedData;
import stockbase.interfaces.authentification.ICAuthenticationData;
import stockbase.interfaces.authentification.ICAuthenticator;

@Service
public class CAuthenticator<D> implements ICAuthenticator<D> {
    @Override public ICAuthenticatedData<D> authenticate(D data, ICAuthenticationData authenticationData) {
        return new CAuthenticatedData<>(data, authenticationData);
    }
}
