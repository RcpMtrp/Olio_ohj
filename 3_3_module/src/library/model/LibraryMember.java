package model;
import java.util.List;
import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private List<Book>borrowedBooks;
    private int id;
    public LibraryMember(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();

    }

    public String getName() {
        return name;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public int getId() {
        return id;
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    public void borrowBook(model.Book book) {
        borrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return name + " " + "member ID: " + " " + id;
    }
}
