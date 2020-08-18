package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");

        while (!input.hasNextDouble()) {
            System.out.println("Invalid");
            input.nextLine();
        }

        double radius = input.nextDouble();
        while (radius < 0) {
            System.out.println("Invalid negative number");
            input.nextLine();
        }

        double area = 3.14 * radius * radius;
        System.out.println("The area of a circle of " + radius + " is " + area);

    }
}
