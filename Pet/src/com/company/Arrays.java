package com.company;

public class Arrays {
    public static void main(String[] args) {
        String [] players = {"John", "Jane", "Smith", "Lee"};

        int counter = 0;

        for (String player : players) {
            if (counter == 3 ) break;

            System.out.println("Congratulations, " + player);

            counter++;
        }
    }
}
