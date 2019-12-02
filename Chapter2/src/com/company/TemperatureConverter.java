package com.company;

public class TemperatureConverter {
    public static String convertTemperature(float temperature, char convertTo) {
        if (convertTo == 'F') {
            return String.format("The temperature in Fahrenheit is %.2f", (9 * temperature / 5 + 32));
        }

        if (convertTo == 'C') {
            return String.format("The temperature in Celsius is %.2f", (temperature - 32) * 5/9);
        }

        return  "You can enter either F or C as convertTo argument";
    }
}
