package com.java.test.service;

import com.java.test.domain.Transaction;
import com.java.test.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Transactional
    public ResponseEntity<Transaction> save(Transaction transaction) {
        return ResponseEntity.ok(transactionRepository.save(transaction));
    }

    public ResponseEntity<Iterable<Transaction>> all() {
        return ResponseEntity.ok(transactionRepository.findAll());
    }

    public ResponseEntity<Transaction> update(Transaction transaction) {
        return ResponseEntity.ok(transactionRepository.save(transaction));
    }
}
