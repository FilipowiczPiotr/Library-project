package filipowicz.library;
import filipowicz.book.Book;

import java.util.ArrayList;
import java.util.List;
public class LibraryManagementSystem {
     Library library;

    public LibraryManagementSystem() {
        this.library = new Library();
    }

    public void addNewBook(String title, String author, int year) {
        Book newBook = new Book(title, author, year);
        library.addBook(newBook);
    }

    public void removeBookByTitle(String title) {
        List<Book> books = library.getAllBooks();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                library.removeBook(book);
                break;
            }
        }
    }

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