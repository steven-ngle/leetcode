package easy;

public class ConvertTheTemperature {
    // EASY
    public double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;

        double[] arr = {kelvin, fahrenheit};

        return arr;
    }
}
