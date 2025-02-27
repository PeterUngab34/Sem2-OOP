/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarytest;

import java.util.ArrayList;

/**
 *
 * @author UNGAB_CPE121
 */
class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void loanBook(Book book, int loanCount) {
        book.decrementCopies(loanCount);
    }

    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}