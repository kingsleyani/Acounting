package com.kingsani;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("you have just deposited #" + amount + " into your account");

        } else {
            System.out.println("you cannot deposit negative sum");
        }
    }

    public void withdraw(int amount) {
        int withdraw = -amount;
        if (amount > this.balance) {
            System.out.println("insufficient balance");
            return;
        }
        if (balance < 0) {
            this.transactions.add(withdraw);
            this.balance -= withdraw;
            System.out.println(amount + " withdrawn from your account");

        } else {
            System.out.println("you cannot withdraw negative amount");
        }
    }
}

