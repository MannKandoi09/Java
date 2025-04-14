import java.util.HashMap;
import java.util.Map;

//Q. Write a program to count the frequency of each character in a string using HashMap.
public class Que4 {
    public static void main(String[] args) {
//        String str = "MannKandoi";
//        Map<Character , Integer> freqMap = new HashMap<>();
//
//        for (char ch : str.toCharArray()){
//            freqMap.put(ch, freqMap.getOrDefault(ch , 0) + 1);
//        }
//
//        for (Map.Entry<Character , Integer> entry : freqMap.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        String str = "mannkandoi";
        Map<Character , Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
