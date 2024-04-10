package com.pluralsight;

public class MathApplication {
    public static void main(String[] args) {
        // Question 1
        int Bobsalary = 12345;
        int Garysalary = 87654;

        // who has higher salary
        int highestsalary = Math.max(Bobsalary, Garysalary);

        //Print the higher salary
        System.out.println("The highest salary is " + highestsalary);

        // Question 2
        // Find and display the smallest of two variables
        double carPrice = 1678;
        double truckPrice = 2364;
        int lowestprice = (int) Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestprice);

        // Question 3
        // Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);

        //Question 4 ,Find and display the square root a variable after it is set to 5.0
        double num = 5.0;
        double squareroot = Math.sqrt(num);
        System.out.println("The sqaure root is " + squareroot);

        //Question 5, Find and display the distance between the points (5,10) (85,50)
        int point1 = 5;
        int point2 = 10;
        int point3 = 85;
        int point4 = 50;
        int difference1 = point3 - point1;
        int difference2 = point4 - point2;
        int square1 = difference1 * difference1;
        int square2 = difference2 * difference2;
        int sumdifference = square1 +square2;
        double distance = Math.sqrt(sumdifference);
        System.out.println("The distance between the points is "+ distance);

        // Question 6 Find and display the absolute value
        double value = -3.8;
        double absolute = Math.abs(value);
        System.out.println("The absolute value is " + absolute);

        // Question 7 find and display a random number between 0 and 1
        System.out.println("Random number between 0 and 1 is " + Math.random());







    }
}
