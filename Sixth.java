public class Sixth {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.func1();
        d.func2();
    }
}

class Demo {
    private static int x;

    void func1() {
        x = 1000;
    }

    void func2() {
        System.out.println(x);
    }
}