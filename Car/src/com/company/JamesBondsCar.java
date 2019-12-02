package com.company;

public class JamesBondsCar extends Car {
    public int drive(int howLong) {
        int distance = howLong * 180;

        System.out.println("This is James Bond's car.");

        System.out.println("James Bond's car has been driven for " + distance + "km");

        return  distance;
    }
}
