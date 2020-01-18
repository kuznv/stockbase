package stockbase.interfaces.authentification;

import base.authentification.IAuthenticator;

public interface ICAuthenticator<D> extends IAuthenticator<D, ICAuthenticationData, ICAuthenticatedData<D>> {
}
