import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

       
        do {
            // Input number
            System.out.print("Enter a number to calculate its factorial: ");
            int number = scanner.nextInt();

            
            if (number < 0) {
                System.out.println("Factorial does not exist for negative numbers.");
            } else {
                long result = 1;

                
                for (int i = 1; i <= number; i++) {
                    result *= i;
                }

               
                System.out.println("The factorial of " + number + " is: " + result);
            }

            
            System.out.print("Do you want to calculate another factorial? (yes/no): ");
            userChoice = scanner.next();

        } while (userChoice.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Goodbye!");
    }
}
