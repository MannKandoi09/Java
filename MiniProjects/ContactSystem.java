////Features:
////Add contact
////Search contact by name
////Delete contact
////Display all contacts
//
////Concepts:
////OOP: Contact class
////Collection: ArrayList<Contact>
//
//

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactSystem {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Contact\n2. Search Contact\n3. Delete Contact\n4. View All\n5. Exit");
            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addContact();
                case 2 -> searchContact();
                case 3 -> deleteContact();
                case 4 -> viewContacts();
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void addContact() {
        System.out.println("Enter Name: ");
        String name = scan.nextLine();

        System.out.println("Enter Phone: ");
        String phone = scan.nextLine();

        contacts.add(new Contact(name, phone));
        System.out.println("Contact Added!");
    }

    static void searchContact() {
        System.out.println("Enter Name to Search: ");
        String name = scan.nextLine();
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println("Name: " + c.name + " , Phone: " + c.phone);
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }

    static void deleteContact() {
        System.out.println("Enter Name to Delete: ");
        String name = scan.nextLine();

        boolean removed = contacts.removeIf(c -> c.name.equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Contact Deleted!");
        } else {
            System.out.println("Contact Not Found!");
        }
    }

    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
            return;
        }
        System.out.println("All Contacts:");
        for (Contact c : contacts) {
            System.out.println("Name: " + c.name + " , Phone: " + c.phone);
        }
    }
}
