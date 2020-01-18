package stockbase.impl.data;

import stockbase.interfaces.data.ICoin;

public enum Coin implements ICoin {
    BTC("Bitcoin"),
    ETH("Ethereum"),
    OMNI_USDT("Omnilayer USDT"),
    ERC_USDT("ERC20 USDT");

    private final String description;

    Coin(String description) {
        this.description = description;
    }

    @Override public String toString() {
        return description;
    }
}