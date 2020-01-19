package stockbase.impl.data;

import stockbase.interfaces.data.ICoin;

public class CPaymentData {
    private ICoin coin;
    private Double amount;
    private String transactionId;

    public CPaymentData(ICoin coin, Double amount, String transactionId) {
        this.coin = coin;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public ICoin getCoin() {
        return coin;
    }

    public Double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }
}