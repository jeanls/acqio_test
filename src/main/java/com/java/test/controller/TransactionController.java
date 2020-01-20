package com.java.test.controller;

import com.java.test.domain.Transaction;
import com.java.test.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping(value = "/transaction", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Transaction> save(@RequestBody @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Transaction transaction) {
        return transactionService.save(transaction);
    }

    @GetMapping(value = "/transaction/all", produces = "application/json")
    public ResponseEntity<Iterable<Transaction>> all() {
        return transactionService.all();
    }

    @PutMapping(value = "/transaction", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Transaction> update(@RequestBody @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Transaction transaction) {
        return transactionService.update(transaction);
    }
}
