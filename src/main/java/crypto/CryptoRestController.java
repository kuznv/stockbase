package crypto;

import crypto.api.request.PaymentRequest;
import crypto.api.request.PaymentRequest.Coin;
import crypto.api.request.TokenRequest;
import crypto.api.response.PaymentResponse;
import crypto.api.response.TokenResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CryptoRestController {
    private static final String serviceAddress = "https://stg-gateway.stockbase.io";
    private static final String oauthAddress = "https://stg-gateway.stockbase.io/oauth/token";
    private static final String paymentAddress = "https://stg-gateway.stockbase.io/api/payment/create";
    private final RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/oauth/token")
    public TokenResponse token(@RequestParam String client_id, @RequestParam String client_secret) {
        TokenRequest tokenRequest = new TokenRequest(client_id, client_secret);
        HttpEntity<TokenRequest> httpEntity = new HttpEntity<>(tokenRequest);

        return restTemplate.exchange(oauthAddress, HttpMethod.POST, httpEntity, TokenResponse.class).getBody();
    }

    @PostMapping("/payment/create")
    public PaymentResponse createPayment(@RequestHeader(name = "Authorization") String authorization,
                                         @RequestParam Coin coin,
                                         @RequestParam Double usd,
                                         @RequestParam String client_transaction_id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(authorization);
        PaymentRequest paymentRequest = new PaymentRequest(coin, usd, client_transaction_id);
        HttpEntity<PaymentRequest> httpEntity = new HttpEntity<>(paymentRequest, headers);
        System.out.println(httpEntity.toString());

        ResponseEntity<PaymentResponse> response = restTemplate.exchange(paymentAddress, HttpMethod.POST, httpEntity, PaymentResponse.class);
        System.out.println("Response: '" + response);
        System.out.println("Response body: '" + response.getBody() + "'");
        return response.getBody();
    }

    private HttpHeaders getAuthorizationHeaders(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);

        return headers;
    }
}
