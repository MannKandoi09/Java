class Students {
    private String name;  // Data hiding

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        name = newName;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Mann");
        System.out.println(s1.getName());
    }
}


