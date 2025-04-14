import java.util.*;

//2. Count frequency of elements in a List
public class Que10 {
    public static void main(String[] args) {
        List<String> Fruits = Arrays.asList("apple", "orange", "apple", "banana", "orange");
        Map<String , Integer> freqMap = new HashMap<>();

        for (String item : Fruits){
            freqMap.put(item,  freqMap.getOrDefault(item, 0) + 1);

        }


        System.out.println(freqMap);

    }
}
