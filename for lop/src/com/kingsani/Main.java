package com.kingsani;

import java.util.Scanner;

public class Main {
// program to print fizz when a number is divisible by 5, buzz when divisible by 3 and fizzbuzz when
    // divisible by both else return number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instantiates
        System.out.println("number: ");
        int number = scanner.nextInt(); // accepts number

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);


    }
}