import java.util.Scanner;

public class SumOfN_Numbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbere");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
