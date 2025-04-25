//1. Create a Java class Person with private fields name and age. Write a constructor to initialize them,
//and a method displayInfo() to print the details.
//Concepts: Constructor, Encapsulation, Access Modifiers


class person{
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: " + name + " ,Age: " + age);
    }
}

public class main {
    public static void main(String[] args) {
        person p = new person("Mann" , 20);
        p.displayInfo();
    }
}
