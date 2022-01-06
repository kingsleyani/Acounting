package com.kingsani;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal :  ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest Rate :  ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT /MONTHS_IN_YEAR;

        System.out.print("Period (years) :  ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * MONTHS_IN_YEAR;

        Double mortgage = principal * (monthlyInterest* Math.pow(1 + monthlyInterest,numberOfPayment)/
                Math.pow(1 + monthlyInterest,numberOfPayment) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage :  "+ mortgageFormatted);

    }
}
