package com.pluralsight;

import java.util.Scanner;
public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone cp1 = new CellPhone();
        CellPhone cp2 = new CellPhone();
        values(cp1);
        display(cp1);
        cp1.dial("682_907_634");
        values(cp2);
        display(cp2);
        cp2.dial("682_907_637");
        cp1.dial(cp2.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }

    public static void values(CellPhone phone) {
        System.out.print("What is the serial number?: ");
        phone.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.print("What is the model of the phone?: ");
        phone.setModel(scanner.nextLine());
        System.out.print("Who is the phone carrier?: ");
        phone.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number?: ");
        phone.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone?: ");
        phone.setOwner(scanner.nextLine());
    }
}
