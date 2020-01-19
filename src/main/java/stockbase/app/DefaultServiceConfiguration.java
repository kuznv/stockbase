package stockbase.app;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class DefaultServiceConfiguration {
    private String authAddress = "https://stg-gateway.stockbase.io/oauth/token";
    private String transactionAddress = "https://stg-gateway.stockbase.io/api/payment/create/oauth/token";
}
