package com.company;

public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;

        System.out.println("Diving for " + howDeep + " feet");

        System.out.println("I'm at " + currentDepth + " feet below sea level");

        return  currentDepth;
    }

    public String talk(String someWord) {
        return  "Don't you know that fish can't talk?";
    }
}
