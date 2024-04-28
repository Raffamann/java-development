package com.pluralsight;

import java.io.*;
import java.util.Scanner;
public class PayRollCalculator {
    static String inputFile;
    static String outPutFile;

    public static void main(String[] args) {
        callFileName(); // order is important put in what order you want the computer to do things
        readFile();
    }
    // create a readFile method
    public static void readFile(){
        try{ // try this!!!
            BufferedReader bufReader = new BufferedReader(new FileReader(inputFile)); // create BufferedReader object //create FileReader object
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(outPutFile)); // create BufferedWriter and FileReader object slay
            String input; // initialize the string variable , "empty container" expecting a type
            boolean skipHeader = false; //creating a way to check the header, so it doesn't break
            while((input = bufReader.readLine()) != null) {    //assign value input, now holds the value of bufReader line from file ("employee.csv")
               // create loop
                if (!skipHeader) {     //condition
                    skipHeader = true; //skips header byeee
                    continue; // exit current iteration, loop
                }
                bufWriter.write(makeEmployee(input)); // plugging in the line of file into makeEmployee
            }
            bufReader.close(); // always make sure to close bufReader, so it can release resources !!!!!
            bufWriter.close(); // make sure to close the writer too dummy
        }
        catch(IOException e){  // with try always have a catch (if not do this)
            e.printStackTrace();
        }
    }
    // Make makeEmployee method
    public static String makeEmployee(String input) {  // letting the method know that makeEmployee is taking a value type String // not void because it returns something, employee values
        String [] tokens = input.split("\\|"); //
        int employeeId = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        double hoursWorked = Double.parseDouble(tokens[2]);
        double payRate = Double.parseDouble(tokens[3]);
        Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
        return String.format("%d| %s| %.2f \n", employee.getEmployeeId(), employee.getName(),employee.getGrossPay());
    }
    public static void callFileName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file to read ");
        inputFile = scanner.nextLine();
        System.out.println("Enter the name of the file to create");
        outPutFile = scanner.nextLine();
        scanner.close();
    }
}
