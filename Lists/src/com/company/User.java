package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements Comparable<User>
{
    public final Long id;
    public final String username;

    User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return String.format("%s:%d", username, id);
    }

    @Override
    public int compareTo(User user) {
        return id.compareTo(user.id);
    }

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();

        users.add( new User(32L, "A"));
        users.add( new User(25L, "B"));
        users.add( new User(28L, ""));

        Collections.sort(users);

        System.out.println(users);
    }
}
