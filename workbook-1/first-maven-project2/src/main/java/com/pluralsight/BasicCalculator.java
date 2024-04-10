package com.pluralsight;

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        // Initalize the scanner
        Scanner scanner = new Scanner(System.in);

        //Tell user to input the first number.
        System.out.print("Enter the first number. ");
        int firstNumber = scanner.nextInt();

        //Tell user to input the second number.
        System.out.print("Enter the second number. ");
        int secondNumber = scanner.nextInt();

        // Show the different calculation options that the user can use.
        System.out.println("");
        System.out.println("Possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("M)ultiply");
        System.out.println("(D)ivide");

        // Tell user to input which option they want to use.
        System.out.print("Please select an option: ");
        char option = scanner.next().charAt(0);

        //Initalize the answer variable.
        int answer = 0;

        // Create the calculator for each choice (lowercase or uppercase) , and check which choice user chose.
        switch (option) {
            case 'A':
                answer = firstNumber + secondNumber;

                // Print out the answer Add was selected.
                System.out.println("");
                System.out.println(firstNumber + "+" + secondNumber + "=" + answer);
                break;
            case 'S':
                answer = firstNumber - secondNumber;

                // Print out the answer Subtract was selected.
                System.out.println("");
                System.out.println(firstNumber + "-" + secondNumber + "=" + answer);
                break;
            case 'M':
                answer = firstNumber + secondNumber;

                // Print out the answer Multiply was selected.
                System.out.println("");
                System.out.println(firstNumber + "*" + secondNumber + "=" + answer);
                break;
            case 'D':
                answer = firstNumber + secondNumber;

                // Print out the answer Divide was selected.
                System.out.println("");
                System.out.println(firstNumber + "/" + secondNumber + "=" + answer);
                break;
        }






    }
}
