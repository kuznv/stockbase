package stockbase.interfaces.service;

import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.api.transaction.CreateTransactionResponse;

public interface ITransactionService {
    CreateTransactionResponse createTransaction(CreateTransactionRequest createTransaction);
}
