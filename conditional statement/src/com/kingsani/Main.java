package com.kingsani;

import java.util.Scanner;//Note the name of file is different from content

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter time :");
        int hour = scanner.nextInt();

    if(hour >=6 && hour <12)
        System.out.println("good morning");
    else if (hour>=20)
        System.out.println("good afternoon");
    else
        System.out.println("enter a the correct time");
    }
}
