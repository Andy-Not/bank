package com.bank.api.account;

import javax.persistence.*;

@Entity
@Table(name = "Account", schema = "andy123")

public class AccountEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_NUMBER", unique = true)
    private int accountNumber;

    @Column(name = "BALANCE", nullable = true)
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
