package stockbase.impl.data;

import stockbase.interfaces.data.ICPaymentData;
import stockbase.interfaces.data.ICoin;

public class CPaymentData implements ICPaymentData {
    private ICoin coin;
    private Double amount;
    private String transactionId;

    public CPaymentData(ICoin coin, Double amount, String transactionId) {
        this.coin = coin;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    @Override public ICoin getCoin() {
        return coin;
    }

    @Override public Double getAmount() {
        return amount;
    }

    @Override public String getTransactionId() {
        return transactionId;
    }
}