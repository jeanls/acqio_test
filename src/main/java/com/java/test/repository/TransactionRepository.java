package com.java.test.repository;

import com.java.test.domain.Transaction;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
