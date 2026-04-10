package com.pluralsight;

import java.util.Scanner;

public class TheApp {

    public static void main(String[] args) {

        //Create our scanner
        Scanner theScanner = new Scanner(System.in);

        //Ask the user/employee for their name
        System.out.print("Enter your name: ");
        //store the answer in the "name" variable
        String name = theScanner.nextLine();

        //Prompt for the hours worked
        System.out.print("Enter hours worked: ");
        //store the hours worked in "hoursWorked"
        double hoursWorked = theScanner.nextDouble();

        //Prompt for pay rate
        System.out.print("Enter pay rate: ");
        //store the answer in "payRate"
        double payRate = theScanner.nextDouble();

        //create a variable to hold the total pay
        double totalPay = 0;

        // If hours are 40 or less, no overtime
        if (hoursWorked <= 40) {

            //calc total pay
            totalPay = hoursWorked * payRate;

        } else {

            // Calculate regular pay (first 40 hours)
            double regularPay = 40 * payRate;

            // Calculate overtime hours
            double overtimeHours = hoursWorked - 40;

            // Calculate overtime pay (1.5x rate)
            double overtimePay = overtimeHours * payRate * 1.5;

            // Total gross pay
            totalPay = regularPay + overtimePay;
        }

        // Display result
        System.out.println(name + "'s gross pay is: " + totalPay);

    }

}
