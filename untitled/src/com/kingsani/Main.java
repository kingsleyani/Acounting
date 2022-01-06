package com.kingsani;

import java.util.Scanner;

public class Main {
//codes to read a number check if its even and return even else odd
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid num: ");
        int number = scanner.nextInt();
        if(number % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        System.out.println("bye");
    }
}
