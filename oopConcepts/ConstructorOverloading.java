class Book{
    String title;

    Book(){
        title = "Untitled";
    }
    Book(String t){
        title = t;
    }

    void showTitle(){
        System.out.println("Book Title: " + title);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java OOPS Concept");

        b1.showTitle();
        b2.showTitle();

    }
}
