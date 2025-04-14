import java.util.ArrayList;
import java.util.List;

//Q. Create an ArrayList of Strings, add 3 names, and print them using a loop.
public class Que3 {
    public static void main(String[] args) {
        List<String> StrList = new ArrayList<>();
        StrList.add("Mann");
        StrList.add("Meet");
        StrList.add("Manthan");

        for (String name : StrList){
            System.out.println(name);
        }



    }
}
