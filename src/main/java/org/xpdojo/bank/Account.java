package org.xpdojo.bank;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public static Account withBalance(int openingBalance) {
        return new Account(openingBalance);
    }

    public boolean hasBalance(int balance) {
        return this.balance == balance;
    }
}
