package com.kingsani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // program to accept student score and print pass or fail based of the score.
        Scanner score = new Scanner(System.in);
        System.out.print("Enter your mark here: ");
        int marks = score.nextInt();
        String result = (marks > 40 )? "pass" : "failed";
        System.out.println("you " + result + " the exam");
        score.close();
    }
}
