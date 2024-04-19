package com.pluralsight;

import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);
        CellPhone cp1 = new CellPhone();
        System.out.print("What is the serial number?: ");
        long sn = scanner.nextLong();
        System.out.print("What is the model of the phone?: ");
        String model = scanner.nextLine();
        System.out.print("Who is the phone carrier?: ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();

    }
}
