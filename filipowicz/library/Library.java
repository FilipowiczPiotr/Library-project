package filipowicz.library;
import filipowicz.book.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * a class representing a library - basically list of books. It is able to add books, remove books and show all books inside it
 */
class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
