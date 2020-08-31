package practice;

public class Temperature {

    private double fahrenheit;

    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {
        double absoluteZeroFahrenheit = -459.67;
        if (aFahrenheit < absoluteZeroFahrenheit) {
            System.out.println("Value is below absolute zero");
        }
        fahrenheit = aFahrenheit;
    }
}
