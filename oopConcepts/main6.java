//6. Create an interface Flyable with a method fly().
//Then create two classes Bird and Aeroplane that implement this interface and define their own version of fly().
//Concepts: Interface, Polymorphism

interface Flyable{
    void fly();
}

class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Bird is Flying.....");
    }
}

class aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Aeroplane is Flying....");
    }
}

public class main6 {
    public static void main(String[] args) {
        Flyable f = new aeroplane();
        Flyable f2 = new Bird();

        f.fly();
        f2.fly();

    }
}
