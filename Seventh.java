import java.util.Scanner;


public class Seventh {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt(); // store input in age variable as integer
            if (age == 18 || age > 18) // codition
            {
                System.out.println("You can vote because you are adult");
            } else {
                System.out.println("You can`t vote bewakuf");
            }
        }
    }
}