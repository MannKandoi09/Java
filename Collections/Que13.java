//Find Maximum and Minimum in a List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Que13 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,45,2,19,9);
        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


    }
}
