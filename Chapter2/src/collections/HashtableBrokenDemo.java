package collections;

import java.util.Hashtable;

public class HashtableBrokenDemo {
    public static void main(String[] args) {
        ContactDetail jane = new ContactDetail();
        jane.fullName = "Jane Doe";
        jane.email = "jane@example.com";
        jane.facebookId = "janedoe";
        jane.phone = "2547-346-865";

        Hashtable friends = new Hashtable();
        friends.put("Jane", jane);

        friends.put("John", "John Doe , john@example.com, johndoe, 3456-43567-567");

        String johnsPhone = ((ContactDetail) friends.get("John")).phone;

        System.out.println("Jogn's phone number is " + johnsPhone);
    }
}
