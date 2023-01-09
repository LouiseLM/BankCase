package org.bank;

import java.math.BigDecimal;
import java.util.List;

public class Account {
    User user;
    String iban;
    BigDecimal balance;
    List<Transaction> transactions;

    public Account(User user) {
        this.user = user;
    }
}
