��import java.util.Scanner;

public class Nine {
        public static void main(String args[]) {
        // for checking even or odd number by taking input from the user
        System.out.println("Enter a number");
        tryScanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = num % 2;
            if (sum == 0) {
                System.out.println("Even number"); 
            } else {
                System.out.println("Odd number.");
            }
        }
    }
}