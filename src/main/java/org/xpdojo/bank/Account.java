package org.xpdojo.bank;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Account {
    private int balance;
    private ArrayList<Integer> activity = new ArrayList<>();

    public Account(int balance) {
        activity.add(balance);
        this.balance = balance;
    }

    public static Account withBalance(int openingBalance) {
        return new Account(openingBalance);
    }

    public boolean hasBalance(int balance) {
        return this.balance == balance;
    }

    public void deposit(int depositAmount) {
        activity.add(depositAmount);
        balance += depositAmount;
    }

    public String reportActivity() {
        return activity.stream().map(Object::toString).collect(Collectors.joining(",", "[", "]"));
    }
}
