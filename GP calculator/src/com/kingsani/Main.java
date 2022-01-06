package com.kingsani;

import java.util.Scanner;
// java codes to read student's various scores and display the GP performance
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        int creditLoad = 3;
        double number;
        System.out.print("Enter student quiz score:  ");
        int quizScore = scanner.nextInt();

        System.out.print("Enter student assignment score:  ");
        int assignmentScore = scanner.nextInt();

        System.out.print("Enter student class attendance: ");
        int classAttendance = scanner.nextInt();

        System.out.print("Enter student Exam score:  ");
        int examScore = scanner.nextInt();
        double total = (quizScore + assignmentScore +classAttendance + examScore);
        double gradePoint = total/creditLoad;
        System.out.println("Your total mark is: " + total);
        System.out.println("your GP is : " + gradePoint);
        if (gradePoint <= 13)
            System.out.println("Your grade fail");

        else if (gradePoint <=16.67 && gradePoint >=13.1)
        System.out.println("your grade pass");
        else if (gradePoint <= 19.9 && gradePoint >=16.7)
            System.out.println("your grade credit");
        else if (gradePoint <= 24.9 && gradePoint >=19.9)
            System.out.println("your grade excellent");
        else if (gradePoint >=25)
            System.out.println("your grade distinction");

    }
}
