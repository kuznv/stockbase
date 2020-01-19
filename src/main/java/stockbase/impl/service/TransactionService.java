package stockbase.impl.service;

import org.springframework.stereotype.Service;
import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.api.transaction.CreateTransactionResponse;
import stockbase.interfaces.service.ITransactionService;

@Service
public class TransactionService implements ITransactionService {

    @Override public CreateTransactionResponse createTransaction(CreateTransactionRequest createTransaction) {
        return null;
    }
}