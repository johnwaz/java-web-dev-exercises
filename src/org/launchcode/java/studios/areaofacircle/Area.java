package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        String radiusInput = input.nextLine();
        while (!isValidInput(radiusInput)) {
            System.out.println("Invalid: negative number");
            radiusInput = input.nextLine();
        }

        double radius = Double.parseDouble(radiusInput);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is " + area);


    }

    private static boolean isValidInput(String input) {
        if(Double.parseDouble(input) < 0) {
            return false;
        }
        return true;
    }
}
