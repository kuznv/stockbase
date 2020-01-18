package stockbase.interfaces.api.transaction;

public interface ICreateTransactionRequest {
    String getCoin();

    Double getUsd();

    String getClientTransactionId();
}
