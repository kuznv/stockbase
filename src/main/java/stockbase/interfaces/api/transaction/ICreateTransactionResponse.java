package stockbase.interfaces.api.transaction;

public interface ICreateTransactionResponse {
    String getAddress();

    Double getAmount();

    String getCrypto();

    Object getExpiresAt(); //TODO: Use proper type

    Object getVerifyUntil();
}
