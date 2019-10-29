package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
//       TODO implements result Convert Celsius to Fahrenheit
        double result = celsius * 9/5 + 32;
        return result;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
//        TODO implements result convert Fahrenheit to Celsius
        double result = (fahrenheit - 32d) * 5d/9d;
        return result;
    }

    public double celsiusToKelvin(double celsius) {
//        TODO implements result convert Celsius to Kelvin
        double result = celsius + 273.16;
        return result;
    }
}
