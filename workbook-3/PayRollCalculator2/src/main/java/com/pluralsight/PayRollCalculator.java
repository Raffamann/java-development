package com.pluralsight;

import java.io.*;
public class PayRollCalculator {
    public static void main(String[] args) {
        readFile();
    }
    public static void readFile(){
        try{
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            boolean skipHeader = false;
            while((input = bufReader.readLine()) != null) {
                if (!skipHeader) {
                    skipHeader = true;
                    continue;
                }
                makeEmployee(input);
            }
            bufReader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void makeEmployee(String input){
        String [] tokens = input.split("\\|");
        int employeeId = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        double hoursWorked = Double.parseDouble(tokens[2]);
        double payRate = Double.parseDouble(tokens[3]);
        Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
        System.out.printf("%d, %s, %.2f \n", employee.getEmployeeId(), employee.getName(),employee.getGrossPay());
    }
}
