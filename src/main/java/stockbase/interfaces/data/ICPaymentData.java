package stockbase.interfaces.data;

import base.data.IPaymentData;

public interface ICPaymentData extends IPaymentData {
    ICoin getCoin();

    Double getAmount(); //TODO: switch to BigDecimal?

    String getTransactionId();
}
