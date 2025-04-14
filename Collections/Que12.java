import java.util.HashMap;
import java.util.Map;

//Check if two Maps are equal
public class Que12 {
    public static void main(String[] args) {
        Map<String , Integer> Map1 = new HashMap<>();
        Map1.put("ONE", 1);
        Map1.put("TWO", 2);

        Map<String, Integer> Map2 = new HashMap<>();
        Map2.put("TWO", 2);
        Map2.put("ONE", 1);


        System.out.println(Map1.equals(Map2));
    }
}
