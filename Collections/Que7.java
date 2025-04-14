import java.util.Stack;

//Q. Implement basic Stack operations using Java's Stack class.
public class Que7 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Top Element : " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack After Pop: " + stack);

    }
}
