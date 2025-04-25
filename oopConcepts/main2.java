//Write a Java program to demonstrate method overloading by
//creating a class Calculator with methods add(int a, int b) and add(double a, double b).
//Concept: Polymorphism (Compile-time)

class Calculator{
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
}

public class main2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("INT ADD: " + cal.add(5,5));
        System.out.println("Double ADD: " + cal.add(5.5,5.5));

    }
}
