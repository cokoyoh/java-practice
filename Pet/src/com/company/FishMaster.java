package com.company;

public class FishMaster {
    public static void main(String[] args) {
        Fish fish = new Fish();

        fish.dive(2);

        fish.dive(130);

        String fishReaction;
        fishReaction = fish.talk("Hello");
        System.out.println(fishReaction);

        fish.sleep();
    }
}
