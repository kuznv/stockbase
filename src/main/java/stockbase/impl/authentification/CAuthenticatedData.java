package stockbase.impl.authentification;

import base.authentification.SimpleAuthenticatedData;
import stockbase.interfaces.authentification.ICAuthenticatedData;
import stockbase.interfaces.authentification.ICAuthenticationData;

public class CAuthenticatedData<D> extends SimpleAuthenticatedData<D, ICAuthenticationData> implements ICAuthenticatedData<D> {

    public CAuthenticatedData(D data, ICAuthenticationData authenticationData) {
        super(data, authenticationData);
    }
}
