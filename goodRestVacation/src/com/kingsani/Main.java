package com.kingsani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days you want: ");
    int days = scanner.nextInt();
        System.out.print("whats the cost of feeding per day: ");
    int foodCost= scanner.nextInt();
        System.out.print("whats the cost of flight: ");
    int flight = scanner.nextInt();
        System.out.print("whats the per night cost for the hotel: ");
        int totalFlightCost = flight * 2;
    int hotelPerNightCost = scanner.nextInt();
    int hotelVacationCost = (days - 1) * hotelPerNightCost;
    int VacationCost = (days * foodCost) + totalFlightCost + hotelVacationCost;
        System.out.print("Your vacation budget should be :" + VacationCost);
    }
}
