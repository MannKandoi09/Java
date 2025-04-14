import java.util.*;

//Given a list with duplicate integers, remove duplicates and print unique elements.
public class Que5 {
    public static void main(String[] args) {
        List<Integer> dupList = new ArrayList<>(Arrays.asList(1,2,2,1,3,4,5));
        System.out.println("Duplicate List: " + dupList);

        Set<Integer> uniSet = new HashSet<>(dupList);
        System.out.println("Unique List: " + uniSet);

    }
}
