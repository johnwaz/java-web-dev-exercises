package practice;

import java.util.Scanner;

public class TemperatureRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature:");
        double temperature = input.nextDouble();
        Temperature temp = new Temperature(temperature);
        temp.setFahrenheit(temperature);
        System.out.println(temp.getFahrenheit());

    }
}
