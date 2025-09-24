package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 50000;
        double garySalary = 70000;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary + ".");

        double carPrice = 29.99;
        double truckPrice = 35.99;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("lowest price: $" + lowestPrice);

        double areaOfACircle = Math.PI * Math.pow(7.25, 2);

        System.out.println("area of a circle is " + areaOfACircle + ".");

        double root = 5.0;

        double squareRoot = Math.sqrt(root);

        System.out.println(squareRoot);

    }
}
