//3. Create a base class Animal with a method makeSound(). Then
//create a subclass Dog that overrides makeSound() to print "Bark!". Call both methods to show runtime polymorphism.
//Concepts: Inheritance, Method Overriding, Dynamic Polymorphism

class Animal{
    void makeSound(){
        System.out.println("Animals make Sound...");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks.....");
    }
}


public class main3 {
    public static void main(String[] args) {

        Animal ab = new Animal();
        ab.makeSound();

        Animal a = new Dog();
        a.makeSound();



    }
}
