package com.kingsani;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName){
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }
    public void depositMoney(int amount) {
        if(amount>0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("you have just deposited" +amount+ "to your account");

        }else {
            System.out.println("you cannot deposit negative sum");
        }
        public void withdraw( int amount);{
            int withdraw = -amount;
            if(amount.this.balance){
                System.out.println("insufficient balance");
                return;
            }
        if(withdraw > 0){
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + "withdrawal from your account");

        }else {
            System.out.println("you cannot withdraw negative amount");

        }
        }

    }

}
