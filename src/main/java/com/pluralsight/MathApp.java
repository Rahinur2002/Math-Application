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

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(distance);

        double absolute = -3.8;

        double abs = Math.abs(absolute);

        System.out.println(abs);


        double random = Math.random();
        System.out.println(random);

        int minuteIntoHour = 60;

        int minuteIntoDay = Math.multiplyExact(24, minuteIntoHour);

        int twentyFourDayIntoMinute = Math.multiplyExact(24, minuteIntoDay);

        System.out.println(twentyFourDayIntoMinute);

    }
}
