import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("3elep", "Something something", "1420340243023");
        Book book2 = new Book("efmowefo", "L L", "234924902303");

        library.addBook(book1);
        library.addBook(book2);
        LibraryMember member1 = new LibraryMember("Teuvo", 1);
        LibraryMember member2 = new LibraryMember("Pekka", 2);
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);
        library.returnBook(member1, book1);
        library.listBooks();
    }
}
