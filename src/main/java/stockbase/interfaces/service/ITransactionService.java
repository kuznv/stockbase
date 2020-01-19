package stockbase.interfaces.service;

import stockbase.impl.api.transaction.CreateTransactionRequest;
import stockbase.impl.api.transaction.CreateTransactionResponse;
import stockbase.interfaces.api.transaction.TransactionException;
import stockbase.interfaces.authentification.ICAuthenticationData;

public interface ITransactionService {
    CreateTransactionResponse createTransaction(CreateTransactionRequest createTransaction, ICAuthenticationData authenticationData) throws TransactionException;
}
