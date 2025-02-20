/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UNGAB_CPE121
 */
class Library {
    private List<Book> books;

    // Constructor initializes the books list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a Book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to update the title of a given Book object
    public void updateBookTitle(Book book, String newTitle) {
        System.out.println("Updating book title from \"" + book.getTitle() + "\" to \"" + newTitle + "\".");
        book.setTitle(newTitle);
    }

    // Method to attempt to change a primitive variable (illustrating pass by value)
    public void attemptPrimitiveChange(int number) {
        System.out.println("Inside method before change: " + number);
        number = 999;
        System.out.println("Inside method after change: " + number);
    }

    // Method to display details of all books in the library
    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}