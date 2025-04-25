//5. Create an abstract class Shape with an abstract method area().
//Create subclasses Circle and Rectangle that implement area() accordingly.
//Concepts: Abstraction, Inheritance


abstract class Shape{
    abstract void area();

}

class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);

    }
}

class Rectangle extends Shape{
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);

    }
}

public class main5 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5);
        Shape s2 = new Rectangle(4,6);

        s1.area();
        s2.area();

    }
}
