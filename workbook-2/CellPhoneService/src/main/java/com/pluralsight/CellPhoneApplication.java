package com.pluralsight;

import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cp1 = new CellPhone();
        System.out.print("What is the serial number?: ");
        cp1.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.print("What is the model of the phone?: ");
        cp1.setModel(scanner.nextLine());
        System.out.print("Who is the phone carrier?: ");
        cp1.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number?: ");
        cp1.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone?: ");
        cp1.setOwner(scanner.nextLine());
        System.out.println(cp1.getSerialNumber());
        System.out.println(cp1.getModel());
        System.out.println(cp1.getCarrier());
        System.out.println(cp1.getPhoneNumber());
        System.out.println(cp1.getOwner());
    }




}
