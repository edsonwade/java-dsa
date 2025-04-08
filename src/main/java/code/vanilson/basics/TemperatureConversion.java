package code.vanilson.basics;

import java.util.Scanner;

/**
 * TemperatureConversion
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-08
 */
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter celsius temperature ?");
        var celsius = sca.nextDouble();
        System.out.println(
                "Conversition  celsius " + celsius + "in Fahrenheit =" + convertCelsiusToFahrenheit(celsius));

    }

     static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9) / 5 + 32;
    }

}