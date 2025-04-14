import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Remove Duplicates from an ArrayList
public class Que2 {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>(list); //Maintains Order
        ArrayList<Integer> uniquelist = new ArrayList<>(set);

        System.out.println("Unique : " + uniquelist);


    }
}


//        Problem 3: Frequency of Characters in a String
//        java
//                Copy
//        Edit
//import java.util.*;
//
//        public class CharFrequency {
//            public static void main(String[] args) {
//                String str = "hello";
//                Map<Character, Integer> map = new HashMap<>();
//
//                for (char ch : str.toCharArray()) {
//                    map.put(ch, map.getOrDefault(ch, 0) + 1);
//                }
//
//                System.out.println("Frequencies: " + map); // Output: {h=1, e=1, l=2, o=1}
//            }
//        }
//✅ Problem 4: Find Second Largest in Array
//        java
//        Copy
//                Edit
//        public class SecondLargest {
//            public static void main(String[] args) {
//                int[] arr = {12, 35, 1, 10, 34, 1};
//                int max = Integer.MIN_VALUE;
//                int secondMax = Integer.MIN_VALUE;
//
//                for (int num : arr) {
//                    if (num > max) {
//                        secondMax = max;
//                        max = num;
//                    } else if (num > secondMax && num != max) {
//                        secondMax = num;
//                    }
//                }
//
//                System.out.println("Second largest: " + secondMax); // Output: 34
//            }
//        }
//✅ Problem 5: OOP - Student Class Example
//        java
//        Copy
//                Edit
//        class Student {
//            String name;
//            int rollNo;
//            int marks;
//
//            Student(String name, int rollNo, int marks) {
//                this.name = name;
//                this.rollNo = rollNo;
//                this.marks = marks;
//            }
//
//            void display() {
//                System.out.println(name + " | Roll: " + rollNo + " | Marks: " + marks);
//            }
//        }
//
//        public class StudentTest {
//            public static void main(String[] args) {
//                Student s1 = new Student("Amit", 1, 78);
//                Student s2 = new Student("Riya", 2, 85);
//                Student s3 = new Student("Shaizu", 3, 92);
//
//                Student top = s1;
//
//                if (s2.marks > top.marks) top = s2;
//                if (s3.marks > top.marks) top = s3;
//
//                System.out.print("Topper: ");
//                top.display();
//            }
//        }