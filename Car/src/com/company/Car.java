package com.company;

public class Car {
    public void start() {
        System.out.println("Staring car.");
    }

    public void stop() {
        System.out.println("Stopping car");
    }

    public int drive(int howLong) {
        int distance;

        distance = howLong * 60;

        return  distance;
    }
}
