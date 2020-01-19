package stockbase.impl.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.api.transaction.CreateTransactionResponse;
import stockbase.interfaces.authentification.ICAuthenticationData;
import stockbase.interfaces.service.ITransactionService;

@Service
public class TransactionService implements ITransactionService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final HttpHeaders httpHeaders;
    @Value("${service.transactionAddress}")
    private String transactionAddress;

    public TransactionService(HttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    @Override public CreateTransactionResponse createTransaction(CreateTransactionRequest createTransaction, ICAuthenticationData authenticationData) {
        httpHeaders.setBearerAuth(authenticationData.getAuthorization());
        HttpEntity<CreateTransactionRequest> httpEntity = new HttpEntity<>(createTransaction, httpHeaders);
        return restTemplate.exchange(transactionAddress, HttpMethod.POST, httpEntity, CreateTransactionResponse.class).getBody();
    }
}