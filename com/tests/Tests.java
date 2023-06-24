package com.tests;

import filipowicz.library.LibraryManagementSystem;

import org.junit.Assert;
import org.junit.Test;

/**
 * tests
 */
public class Tests {
@Test
public void testRemoveBookByTheTitle() {
    LibraryManagementSystem lms = new LibraryManagementSystem();
    lms.addNewBook("Dziady", "Adam Mickiewicz", 1823);
    lms.addNewBook("Kordian", "Juliusz Słowacki", 1833);

    Assert.assertTrue(lms.removeBookByTitle("Dziady").equals("Dziady"));
}
    @Test
    public void testNegativeRemoveBookByTheTitle() {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addNewBook("Pan Tadeusz", "Adam Mickiewicz", 1823);
        lms.addNewBook("Kordian", "Juliusz Słowacki", 1833);

        Assert.assertFalse(lms.removeBookByTitle("Dziady").equals("Dziady"));
    }

}