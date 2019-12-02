package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converting 21C to Fahrenheit. " + TemperatureConverter.convertTemperature(21, 'F'));
        System.out.println("Converting 70F to Celsius. " + TemperatureConverter.convertTemperature(70, 'C'));
    }
}
