package phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Jermaine Cole", "917-123-4567");
        phoneBook.addAll("Sean Carter", "718-987-6543", "347-123-4567");
        phoneBook.add("Jermaine Cole", "929-111-2222");

        System.out.println("Phone Numbers for Jermaine Cole: " + phoneBook.lookup("Jermaine Cole"));
        System.out.println("Reverse Lookup for 347-123-4567: " + phoneBook.reverseLookup("347-123-4567"));
        System.out.println("All Contact Names:\n" + phoneBook.getAllContactNames());
    }
}


