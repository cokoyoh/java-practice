package collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList friends = new ArrayList();

        friends.add("John");
        friends.add("Jane");
        friends.add("Smith");
        friends.add("Lee");

        int friendsCount = friends.size();

        for(Object friend : friends) {
            System.out.println(friend);
        }

        for (int index = 0; index < friendsCount; index ++) {
            System.out.println(friends.get(index));
        }

        friends.add("Shaz");

        System.out.println(friends.size());
    }
}
