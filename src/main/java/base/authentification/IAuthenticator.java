package base.authentification;

public interface IAuthenticator<D, A extends IAuthenticationData, AD extends IAuthenticatedData<D, A>> {
    AD authenticate(D data, A authenticationData);
}
