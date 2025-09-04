package system;

import model.Book;
import model.LibraryMember;
import java.util.List;
import java.util.ArrayList;
public class Library {
    private List<Book> books;
    private List<LibraryMember> members;
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void addMember(LibraryMember member) {
        members.add(member);
    }
    public void borrowBook(LibraryMember member,  Book book) {
        if (books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
            }else{
            System.out.println("Book not found :"  + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        member.returnBook(book);
        books.add(book);
        System.out.println(member.getName() + " returned " + book.getTitle());
    }
    public void listBooks() {
        System.out.println("Books available: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
