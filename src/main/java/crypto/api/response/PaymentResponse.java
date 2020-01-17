package crypto.api.response;

public class PaymentResponse {
    private String address;
    private Double amount;
    private String crypto;
    private Object expires_at;
    private Object verify_until;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCrypto() {
        return crypto;
    }

    public void setCrypto(String crypto) {
        this.crypto = crypto;
    }

    public Object getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(Object expires_at) {
        this.expires_at = expires_at;
    }

    public Object getVerify_until() {
        return verify_until;
    }

    public void setVerify_until(Object verify_until) {
        this.verify_until = verify_until;
    }
}
