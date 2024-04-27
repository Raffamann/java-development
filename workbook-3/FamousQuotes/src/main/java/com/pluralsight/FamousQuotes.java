package com.pluralsight;

import java.util.Scanner;
public class FamousQuotes {
    static Scanner scanner = new Scanner(System.in);
    static String [] quotes = {" quote 1", " quote 2", " quote 3", " quote 4", " quote 5", " quote 6 "," quote 7 ", " quote 8 ", "quote 9 ", "quote 10 "};
    public static void main(String[] args) {
    homeScreen();

}
    public static void homeScreen () {
        System.out.println(" 1- Choose a quote, 2- Random quote, 3 - Leave ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            quoteOption();
        } else if (choice == 2){
            randomQuote();
        } else {
            System.out.println("Have a good one, PEACE!! <3");
        }
    }
    public static void quoteOption () {
        try {
            System.out.println(" Please select between 1 - 10 ");
            int num = scanner.nextInt();
            num--;
            System.out.println(quotes[num]);
            System.out.println(" 1- Want to select another, 2- Leave ");
            int choice = scanner.nextInt();
            if (choice == 1){
                homeScreen();
            }else{
                System.out.println(" Alrighty then byeeeee!!!");
            }
        } catch (Exception e) {
            System.out.println(" Ummmm that's not a valid number option");
            quoteOption();
        }
    }
    public static void randomQuote() {
        int num = (int)(Math.random() * 10) +1;
        num--;
        System.out.println(quotes[num]);
        homeScreen();
    }
}

