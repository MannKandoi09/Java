//Runtime Polymorphism (Method Overriding)
class Animal{
    void sound(){
        System.out.println("Animals make an Sound...");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cats meows....");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();

    }
}
