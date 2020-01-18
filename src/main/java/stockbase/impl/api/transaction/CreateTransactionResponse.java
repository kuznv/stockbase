package stockbase.impl.api.transaction;

import stockbase.interfaces.api.transaction.ICreateTransactionResponse;

public class CreateTransactionResponse implements ICreateTransactionResponse {
    private final String address;
    private final Double amount;
    private final String crypto;
    private final Object expiresAt;
    private final Object verifyUntil;

    public CreateTransactionResponse(String address, Double amount, String crypto, Object expiresAt, Object verifyUntil) {
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
