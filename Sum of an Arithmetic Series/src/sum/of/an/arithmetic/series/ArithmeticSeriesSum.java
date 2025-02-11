/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.of.an.arithmetic.series;

/**
 *
 * @author UNGAB_CPE121
 */
import java.util.Scanner;

public class ArithmeticSeriesSum {
    private int n; 

    
    public ArithmeticSeriesSum(int n) {
        this.n = n;
    }

    
    public int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    
    public void displayResult() {
        int loopSum = calculateSum();
        int formulaSum = (n * (n + 1)) / 2; 
        System.out.println("\nUpper Limit (n): " + n);
        System.out.println("Calculated Sum (Loop): " + loopSum);
        System.out.println("Formula Sum: " + formulaSum);
        System.out.println("Validation: " + (loopSum == formulaSum ? "Correct" : "Mismatch"));
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nEnter a number (or -1 to exit): ");
            int num = scanner.nextInt();
            
            if (num == -1) { 
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            if (num < 1) { 
                System.out.println("Please enter a positive integer.");
                continue;
            }

            
            ArithmeticSeriesSum series = new ArithmeticSeriesSum(num);
            series.displayResult();
        }

        scanner.close();
    }
}

