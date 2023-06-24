package com.main;

import filipowicz.library.LibraryManagementSystem;


public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addNewBook("Dziady", "Adam Mickiewicz", 1823);
        lms.addNewBook("Kordian", "Juliusz Słowacki", 1833);
        lms.addNewBook("W pustyni i w puszczy", "Henryk Sienkiewicz", 1910);
        lms.addNewBook("Wesele", "Stanisław Wyspiański", 1901);
        lms.addNewBook("Pan Tadeusz", "Adam Mickiewicz", 1834);

        lms.displayAllBooks();
        System.out.println();

        lms.removeBookByTitle("Kordian");

        lms.displayAllBooks();

        lms.searchBooksByAuthor("Adam Mickiewicz");
        System.out.println();
        lms.searchBooksByTitle("Kordian");
    }
}
