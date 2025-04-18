//Method With Parameters, No Return

class greeter{
    void greets(String name){
        System.out.println("Hello, " + name + "!");
    }
}
public class Method2 {
    public static void main(String[] args) {
        greeter g = new greeter();
        g.greets("Mann");

    }
}
