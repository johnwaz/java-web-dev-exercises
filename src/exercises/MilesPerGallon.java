package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many miles have you driven:");
        double miles = input.nextDouble();
        System.out.println("And how many gallons of gas was consumed:");
        double gas = input.nextDouble();
        double milesPerGallon = miles / gas;
        System.out.println("Your miles per gallon is " + milesPerGallon);
    }
}
