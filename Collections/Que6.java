import java.util.Map;
import java.util.TreeMap;

//Store names and their scores using TreeMap and print in sorted order.
public class Que6 {
    public static void main(String[] args) {
        Map<String , Integer> sorMap = new TreeMap<>();

        sorMap.put("Mann", 99);
        sorMap.put("Ravi ", 100);
        sorMap.put("Devansh" , 44);
        sorMap.put("Rutvik" , 66);

        for (Map.Entry<String , Integer> entry : sorMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
