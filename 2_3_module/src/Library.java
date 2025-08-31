import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog");
        int i = 1;
        for (Book book : books) {
            System.out.println(i++ + ". " + "Title: " + "\"" + book.getTitle() + "\"" + ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by author " +  author + ":");
        boolean isFound = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No books found");
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("Borrowing book: " + book.getTitle());
                return;
            }
        }
    }
/*
    public void returnBook(String title) {
        for (Book book : books) {
            if (!book.getTitle().equals(title)) {
                books.add(book);
                System.out.println("Returning book: " + book.getTitle());
                return;
            }
        }
            }

 */
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Returning book: " + book.getTitle());
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }


}