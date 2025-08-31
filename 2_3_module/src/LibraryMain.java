public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book libraryBook = new Book("Introduction to java programming", "John Smith", 2020);
        Book libraryBook2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book libraryBook3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        libraryBook.setRating(3.5);
        libraryBook.addReview("Mid book");

        library.addBook(libraryBook);
        library.addBook(libraryBook2);
        library.addBook(libraryBook3);

        library.displayBooks();

        library.findBooksByAuthor("John Smith");

        library.borrowBook("The Art of Fiction");

        //library.displayBooks();

        library.returnBook(libraryBook3);

        library.displayBooks();

        String searchTitle = "The Art of Fiction";
        boolean isAvailable = library.isBookAvailable(searchTitle);
        if (isAvailable) {
            System.out.println("\"" + searchTitle + "\"" + " is available");
        } else  {
            System.out.println("\"" + searchTitle + "\"" + " is not available");
        }

        System.out.println(libraryBook.getRating());
        //System.out.println(libraryBook.getReview());
        for (String review : libraryBook.getReview()) {
            System.out.println("User review of " + libraryBook.getTitle() +  ": " + review);
        }










    }
}
