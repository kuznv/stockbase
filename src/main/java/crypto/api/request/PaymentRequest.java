package crypto.api.request;

public class PaymentRequest {
    private Coin coin;
    private Double usd;
    private String client_transaction_id;

    public PaymentRequest(Coin coin, Double usd, String client_transaction_id) {
        this.coin = coin;
        this.usd = usd;
        this.client_transaction_id = client_transaction_id;
    }

    public Coin getCoin() {
        return coin;
    }

    public Double getUsd() {
        return usd;
    }

    public String getClient_transaction_id() {
        return client_transaction_id;
    }

    public enum Coin {
        btc,
        eth,
        omni_usdt,
        erc_usdt,
    }
}
