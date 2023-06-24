package filipowicz.book;

/**
 * a class representing a book with 3 fields - title, author and date of publication
 */
public class Book {
    String title;
    String author;
    int publicationDate;

    public Book(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    /**
     * a method which returns information about a book
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Publication Date: " + publicationDate;
    }
}
