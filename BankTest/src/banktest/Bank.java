/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banktest;

/**
 *
 * @author UNGAB_CPE121
 */
class Bank {
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transfer completed: " + amount + " moved from Account " + from.getAccountNumber() + " to Account " + to.getAccountNumber());
        } else {
            System.out.println("Transfer unsuccessful: Not enough balance.");
        }
    }
}

