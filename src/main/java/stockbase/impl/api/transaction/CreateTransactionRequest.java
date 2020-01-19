package stockbase.impl.api.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import stockbase.interfaces.api.transaction.ICreateTransactionRequest;

public class CreateTransactionRequest implements ICreateTransactionRequest {
    private final String coin;
    private final Double usd;
    private final String clientTransactionId;

    @JsonCreator
    public CreateTransactionRequest(String coin, Double usd, String clientTransactionId) {
        this.coin = coin;
        this.usd = usd;
        this.clientTransactionId = clientTransactionId;
    }

    @Override public String getCoin() {
        return coin;
    }

    @Override public Double getUsd() {
        return usd;
    }

    @JsonProperty("client_transaction_id")
    @Override public String getClientTransactionId() {
        return clientTransactionId;
    }
}
