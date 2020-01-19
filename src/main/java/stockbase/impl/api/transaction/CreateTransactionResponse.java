package stockbase.impl.api.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import stockbase.interfaces.api.transaction.ICreateTransactionResponse;

public class CreateTransactionResponse implements ICreateTransactionResponse {
    private final String address;
    private final Double amount;
    private final String crypto;
    private final Object expiresAt;
    private final Object verifyUntil;

    @JsonCreator
    public CreateTransactionResponse(@JsonProperty("address") String address,
                                     @JsonProperty("amount") Double amount,
                                     @JsonProperty("crypto") String crypto,
                                     @JsonProperty("expires_at") Object expiresAt,
                                     @JsonProperty("verify_until") Object verifyUntil) {
        this.address = address;
        this.amount = amount;
        this.crypto = crypto;
        this.expiresAt = expiresAt;
        this.verifyUntil = verifyUntil;
    }

    @Override public String getAddress() {
        return address;
    }

    @Override public Double getAmount() {
        return amount;
    }

    @Override public String getCrypto() {
        return crypto;
    }

    @Override public Object getExpiresAt() {
        return expiresAt;
    }

    @Override public Object getVerifyUntil() {
        return verifyUntil;
    }

}
