package com.kingsani;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Account kingsAccount = new Account("kings");
    kingsAccount.deposit(1000);
    kingsAccount.withdraw(2000);
    kingsAccount.withdraw(-500);
    kingsAccount.withdraw(500);

        System.out.println("your account balance is  "+ kingsAccount.getBalance());
}
}