package com.fraud;

import com.fraud.model.Transaction;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Transaction t1 = new Transaction("ACC1001", 1200.50, "Amazon", "India", LocalDateTime.now(), "DEBIT");
        Transaction t2 = new Transaction("ACC1002", 90000, "CryptoX", "Nigeria", LocalDateTime.now(), "DEBIT");
        System.out.println(t1);
        System.out.println(t2);
    }
}