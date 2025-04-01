//25-3-25 Collections Started

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Mann");
        name.add("Meet");
        name.add("Om");
        name.add("Mann");
        name.add("RISE");

        List<String> Names = new ArrayList<>();
        Names.add("Java");
        Names.add("Python");
        Names.add("VISA");



        System.out.println(name);

//        agar ek list me he check kar na ho toh then so with contains
        System.out.println(name.contains("mann"));

//        contains all for 2 list me check kar na ho then go with contains all
        System.out.println(name.containsAll(Names));

        //0 index pe kon hai toh get methos use karo
        //agar value ke index chaiye then go with index of
        System.out.println(name.get(0));

//        Agar nai hogi then -1 ayega
        System.out.println(name.indexOf("RISE"));

        System.out.println(name.getClass());

        System.out.println(name.getFirst());
        System.out.println(name.getLast());

        //agar delete kar na ho list me se toh index dalo
        System.out.println(name.remove(2));
        System.out.println(name);

        //Name se bhi remove kar sakte hai
        System.out.println(name.remove("Meet"));

        System.out.println(name);
        for (String i : name) {
            System.out.println(i);
        }
    }
}
