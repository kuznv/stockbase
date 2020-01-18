package stockbase.impl.authentification;

import stockbase.interfaces.authentification.ICAuthenticatedData;
import stockbase.interfaces.authentification.ICAuthenticationData;
import stockbase.interfaces.authentification.ICAuthenticator;

public class CAuthenticator<D> implements ICAuthenticator<D> {
    @Override public ICAuthenticatedData<D> authenticate(D data, ICAuthenticationData authenticationData) {
        return new CAuthenticatedData<>(data, authenticationData);
    }
}
