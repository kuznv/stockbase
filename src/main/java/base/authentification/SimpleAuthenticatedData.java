package base.authentification;

public class SimpleAuthenticatedData<D, A extends IAuthenticationData> implements IAuthenticatedData<D, A> {

    private final D data;
    private final A authenticationData;

    public SimpleAuthenticatedData(D data, A authenticationData) {
        this.data = data;
        this.authenticationData = authenticationData;
    }

    @Override public D getData() {
        return data;
    }

    @Override public A getAuthenticationData() {
        return authenticationData;
    }
}
