package com.company;

public class Main {

    public static void main(String[] args) {
        Car car  = new Car();

        car.start();

        int distance = car.drive(2);

        System.out.println("You have driven for " + distance + " km");

        car.stop();

        System.out.println("****************************************");

        JamesBondsCar jamesBondsCar = new JamesBondsCar();

        jamesBondsCar.drive(2);
    }
}
