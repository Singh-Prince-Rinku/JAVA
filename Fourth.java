public class Fourth {
    public static void main(String[] args) {
        Area.func4();   // Class name then dot(.)and function name for call function from another class  like Area.func4() as in main method
    }
}

class Area {
    static void func4() {
        System.out.println("Calling function from another class");
    }
}
