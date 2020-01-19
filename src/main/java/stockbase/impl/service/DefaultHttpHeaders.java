package stockbase.impl.service;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
class DefaultHttpHeaders {

    @Bean HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        return headers;
    }
}
