package stockbase.impl.authentification;

import base.authentification.SimplePaymentAuthenticatedData;
import stockbase.impl.data.CPaymentData;
import stockbase.interfaces.authentification.ICPaymentAuthenticatedData;
import stockbase.interfaces.authentification.ICPaymentAuthenticationData;
import stockbase.interfaces.data.ICPaymentData;
import stockbase.interfaces.data.ICoin;

public class CPaymentAuthenticatedData extends SimplePaymentAuthenticatedData<ICPaymentData, ICPaymentAuthenticationData> implements ICPaymentAuthenticatedData {

    private final ICoin coin;
    private final Double amount;
    private final String transactionId;
    private final String authorization;

    public CPaymentAuthenticatedData(ICPaymentData paymentData, ICPaymentAuthenticationData authenticationData) {
        super(paymentData, authenticationData);
        this.coin = paymentData.getCoin();
        this.amount = paymentData.getAmount();
        this.transactionId = paymentData.getTransactionId();
        this.authorization = authenticationData.getAuthorization();
    }

    public CPaymentAuthenticatedData(ICoin coin, Double amount, String transactionId, String authorization) {
        this(new CPaymentData(coin, amount, transactionId), new CPaymentAuthenticationData(authorization));
    }


    @Override public String getAuthorization() {
        return authorization;
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
