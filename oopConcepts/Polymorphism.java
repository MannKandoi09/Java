//Polymorphism
//Definition: Ek hi naam ka method alag-alag form mein kaam kare.
//1. Compile-time Polymorphism (Method Overloading)

class calculator{
    int add(int a, int b){
        return a + b;
    }

    double add(double a , double b){
        return a + b;
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println("INT ADD: " + c.add(10, 10));
        System.out.println("DOUBLE ADD: " + c.add(10.5, 10.5));

    }
}
