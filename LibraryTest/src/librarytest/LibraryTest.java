/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarytest;

/**
 *
 * @author UNGAB_CPE121
 */
public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 5);
        Book book2 = new Book("1984", "George Orwell", 3);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 4);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display initial inventory
        library.displayLibrary();
        
        // Loan a book
        System.out.println("\nLoaning 2 copies of '1984'...");
        library.loanBook(book2, 2);
        
        // Display inventory after loan
        library.displayLibrary();
    }
}