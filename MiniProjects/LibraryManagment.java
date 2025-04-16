import java.util.*;

class Book {
    String title, author;
    int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Member {
    String name;
    Set<Book> borrowedBooks = new HashSet<>();

    public Member(String name) {
        this.name = name;
    }

    void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    void showBooks() {
        System.out.println(name + " borrowed:");
        for (Book b : borrowedBooks) {
            System.out.println(b.title + " by " + b.author + " (ISBN: " + b.isbn + ")");
        }
    }
}

public class LibraryManagment {
    public static void main(String[] args) {
        List<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Book("Atomic Habits", "James Clear", 101));
        libraryBooks.add(new Book("The Alchemist", "Paulo Coelho", 102));

        Member m1 = new Member("Mann");
        m1.borrowBook(libraryBooks.get(0));
        m1.borrowBook(libraryBooks.get(1));
        m1.showBooks();
    }
}
