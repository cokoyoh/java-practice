package collections;

import java.util.Hashtable;

public class HashtableGenericsDemo {
    public static void main(String[] args) {
        ContactDetail jane = new ContactDetail();
        jane.fullName = "Jane Doe";
        jane.email = "jane@example.com";
        jane.facebookId = "janedoe";
        jane.phone = "2547-346-865";

        Hashtable <String, ContactDetail> friends = new Hashtable<>();
        friends.put("Jane", jane);

//        friends.put("John", "John Doe, john@example.com, johndoe, 3456-43567-567");

        String janesPhone = friends.get("Jane").phone;

        System.out.println("Jane's phone number is " + janesPhone);
    }
}
