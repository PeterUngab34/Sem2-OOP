/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banktest;

import java.util.Scanner;

/**
 *
 * @author UNGAB_CPE121
 */
public class BankTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for first account
        System.out.print("Enter first account number: ");
        String acc1Number = scanner.nextLine();
        System.out.print("Enter initial balance for first account: ");
        double acc1Balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        // Get user input for second account
        System.out.print("Enter second account number: ");
        String acc2Number = scanner.nextLine();
        System.out.print("Enter initial balance for second account: ");
        double acc2Balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        // Create bank accounts
        BankAccount acc1 = new BankAccount(acc1Number, acc1Balance);
        BankAccount acc2 = new BankAccount(acc2Number, acc2Balance);
        
        // Display initial balances
        System.out.println("\nAccount details before transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
        
        // Get transfer details
        System.out.print("\nEnter the amount to transfer: ");
        double transferAmount = scanner.nextDouble();
        
        // Perform a transfer
        Bank bank = new Bank();
        bank.transferMoney(acc1, acc2, transferAmount);
        
        // Display balances after transfer
        System.out.println("\nAccount details after transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
        
        scanner.close();
    }
}
