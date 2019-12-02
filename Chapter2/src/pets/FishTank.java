package pets;

import java.util.ArrayList;

public class FishTank {
    public static void main(String[] args) {
        ArrayList fishTank = new ArrayList();

        Fish fishOne = new Fish(2.5f, "Red");
        Fish fishTwo = new Fish(5, "Green");
        Fish fishThree = new Fish(3.4f, "Brown");
        Fish theFish;

        fishTank.add(fishOne);
        fishTank.add(fishTwo);
        fishTank.add(fishThree);

        int fishCount = fishTank.size();

        for (int index = 0; index <  fishCount; index++) {
            theFish = (Fish) fishTank.get(index);

            System.out.println("Got the " +
                theFish.getColor() + " fish that weighs " +
                theFish.getWeight() + " pounds"
            );
        }
    }
}
