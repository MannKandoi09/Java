import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//1. Reverse elements of a List
public class Que9 {
    public static void main(String[] args) {
        List<String> Alpha = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Ordered List: " + Alpha);
        Collections.reverse(Alpha);
        System.out.println("Reversed List: " + Alpha);

    }
}
