package filipowicz.library;
import filipowicz.book.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Managing system of a library class
 */
public class LibraryManagementSystem {
     public Library library;

    public LibraryManagementSystem() {
        this.library = new Library();
    }

    /**
     * this method adds a book to the library
     */
    public void addNewBook(String title, String author, int year) {
        Book newBook = new Book(title, author, year);
        library.addBook(newBook);
    }

    public Library getLibrary() {
        return library;
    }

    /**
     * this method remove book by the title
     */
    public String removeBookByTitle(String title) {
        List<Book> books = library.getAllBooks();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                library.removeBook(book);
                return title;
            }
        }
        return "0";
    }

    /**
     * this method shows us all books in the library
     */
    public void displayAllBooks() {
        List<Book> books = library.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    /**
     * this method gets author and search all books in the library of this author
     */
    public void searchBooksByAuthor(String author) {
        List<Book> books = library.getAllBooks();
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                matchingBooks.add(book);
            }
        }

        if (matchingBooks.isEmpty()) {
            System.out.println("No books found by the author: " + author);
        } else {
            System.out.println("Books by the author " + author + ":");
            for (Book book : matchingBooks) {
                System.out.println(book);
            }
        }
    }

    /**
     * this method gets title and searches whole library to check if a book is in library or not
     */
    public void searchBooksByTitle(String title) {
        List<Book> books = library.getAllBooks();
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                matchingBooks.add(book);
            }
        }

        if (matchingBooks.isEmpty()) {
            System.out.println("No books found with the title containing: " + title);
        } else {
            System.out.println("Books with the title containing " + title + ":");
            for (Book book : matchingBooks) {
                System.out.println(book);
            }
        }
    }


}