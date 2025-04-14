import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Sort a Map by keys
public class Que11 {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("Banana" , 4);;
        map.put("Apple" , 2);
        map.put("Mango" , 3);

        Map<String , Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);
    }
}
