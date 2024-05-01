import java.util.InputMismatchException;
import java.util.Scanner;

public class Errors {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            try {
                System.out.print("Please enter your age: ");
                int age = scanner.nextInt();

                // Check if the age is a plausible human age
                if (age < 0 || age > 120) {
                    throw new IllegalArgumentException("Please enter a valid age between 0 and 120.");
                }

                System.out.println("Your age is: " + age);
                continueInput = false;  // Stop the loop if successful
            } catch (InputMismatchException e) {
                System.err.println("Error: You must enter a valid integer.");
                scanner.next();  // Consume the incorrect input
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {
                // This block executes whether an exception is thrown or not
                System.out.println("Attempt to enter age completed.");
            }
        }
        scanner.close();
        System.out.println("Program ended.");
    }
}
