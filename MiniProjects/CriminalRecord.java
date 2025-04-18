//Project: Criminal Record Tracker System
//Features:
//Add criminal
//Display all criminals
//Search by name
//Mark as "Captured"

import java.util.*;

class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Criminal extends Person {
    private int id;
    private String crimeType;
    private String status; // Wanted or Captured

    public Criminal(int id, String name, int age, String gender, String crimeType) {
        super(name, age, gender);
        this.id = id;
        this.crimeType = crimeType;
        this.status = "Wanted";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void capture() {
        this.status = "Captured";
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Gender: " + gender +
                ", Crime: " + crimeType + ", Status: " + status);
    }
}

public class CriminalRecord {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Criminal> criminals = new ArrayList<>();
    static int idCounter = 100;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n-------- Criminal Record Tracker --------");
            System.out.println("1. Add Criminal");
            System.out.println("2. Show All Criminals");
            System.out.println("3. Search by Name");
            System.out.println("4. Mark as Captured");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addCriminal();
                case 2 -> showAll();
                case 3 -> searchCriminal();
                case 4 -> markCaptured();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option!");
            }
        } while (choice != 5);
    }

    static void addCriminal() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter Crime Type: ");
        String crime = sc.nextLine();

        Criminal c = new Criminal(idCounter++, name, age, gender, crime);
        criminals.add(c);
        System.out.println("Criminal added successfully.");
    }

    static void showAll() {
        if (criminals.isEmpty()) {
            System.out.println("No criminal records found.");
        } else {
            for (Criminal c : criminals) {
                c.display();
            }
        }
    }

    static void searchCriminal() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Criminal c : criminals) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.display();
                found = true;
            }
        }
        if (!found) System.out.println("No such criminal found.");
    }

    static void markCaptured() {
        System.out.print("Enter Criminal ID to mark as captured: ");
        int id = sc.nextInt();
        for (Criminal c : criminals) {
            if (c.getId() == id) {
                if (c.getStatus().equals("Captured")) {
                    System.out.println("Already marked as Captured.");
                } else {
                    c.capture();
                    System.out.println("Criminal marked as Captured.");
                }
                return;
            }
        }
        System.out.println("Criminal ID not found.");
    }
}
