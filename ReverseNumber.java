public class ReverseNumber {
    public static void main(String[] args) {
        int i, j = 0;
        for (i = 0; i < args.length; i++) {
            j = j + Integer.parseInt(args[i]);
        }
        for (j = args.length; j > 0; j--) {
            System.out.println(j);
        } 

    }
}
