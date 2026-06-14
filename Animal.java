//Consructor OverRiding Example
class Zoo {
    String name;

//    public Zoo() {
//        System.out.println("Hello from Constructor Zoo");
//    }

    public Zoo(String name) {
        this.name = "Lion";
    }

    void makeSound(){
        System.out.println("Animals Makes Sound.");

    }
}

class Dog extends Zoo{
//    public Dog() {
//        System.out.println("Hello From Constructor Dog");
//    }

    public Dog(String name) {
        super("Lion");
        System.out.println("Lion is Roaring");
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Dog is Barking");
    }
}

public class Animal{
    public static void main(String[] args) {
        Dog mydog = new Dog("Lion");
        mydog.makeSound();

    }
}