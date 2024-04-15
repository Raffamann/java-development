package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName, middleName, lastName, suffix, fullName;
        System.out.print("Please enter your first name: ");
        firstName = scanner.nextLine();
        firstName = firstName.trim();
        System.out.print("Please enter your middle name: Enter N/A if you don't have one ");
        middleName = scanner.nextLine();
        middleName = middleName.trim();
        System.out.print("Please enter your last name:");
        lastName = scanner.nextLine();
        lastName = lastName.trim();
        System.out.println("Do you have a suffix? Enter N/A if you don't have one ");
        suffix = scanner.nextLine();

        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName;
        }
    }

}
