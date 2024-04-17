package com.pluralsight;
//always import!!
import java.util.Scanner;
public class AddressBuilder {
    //always main body!!
    public static void main(String [] args) {
        //dont forget to put scanner in!
        Scanner scanner = new Scanner(System.in);
        StringBuilder info = new StringBuilder();
        String fullName, billingStreet, billingCity, billingState, billingZip, shippingStreet, shippingCity, shippingState, shippingZip;
        // promt user for their info
        System.out.print("What is your name?: ");
        fullName = scanner.nextLine();
        System.out.print("What is your stress address?: ");
        billingStreet = scanner.nextLine();
        System.out.print("What is your city?: ");
        billingCity = scanner.nextLine();
        System.out.print("What is your state?: ");
        billingState = scanner.nextLine();
        System.out.print("What is your zipcode?: ");
        billingZip = scanner.nextLine();
        System.out.print("What is your shipping address?: ");
        shippingStreet = scanner.nextLine();
        System.out.print("What is your shipping state?: ");
        shippingState = scanner.nextLine();
        System.out.print("What is your shipping zip code?: ");
        shippingZip = scanner.nextLine();

        info.append("Full Name: " + fullName +"\n");
        info.append("Billing Street: " + billingStreet +"\n");
        info.append("City: " + billingCity +"\n");
        info.append("State: " + billingState +"\n");
        info.append("Zipcode: " + billingZip +"\n");
        //like adding new paragraph (/n)
        info.append("\n" + "Shipping Address: " + shippingStreet +"\n");
        info.append("Shipping State: " + shippingState +"\n");
        info.append("Shipping Zipcode: " + shippingZip +"\n");

        String myData = info.toString();
        System.out.println(myData);

    }



}
