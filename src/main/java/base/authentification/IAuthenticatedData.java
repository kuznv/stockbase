package base.authentification;

public interface IAuthenticatedData<D, A extends IAuthenticationData> extends IAuthenticationData {

    D getData();

    A getAuthenticationData();
}
