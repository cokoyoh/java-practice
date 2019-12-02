package com.company;

public class Pet {
    int age;
    double height, weight;
    String color;

    public void sleep() {
        System.out.println("Good night, see you tomorrow");
    }

    public void eat() {
        System.out.println("I am so hungry, please let me have some snacks like nachos!");
    }

    public String talk(String aWord) {
        return "Ok!! Ok!! " + aWord;
    }
}
