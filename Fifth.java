public class Fifth {
    public static void main(String[] args) {
        First f1 = new First(); // make object for non static method to use it and f1 ia the refrence of the class
        f1.x = 50;
        System.out.println(f1.x);
        //f1.y=9999999; // it causes error because y is private and we cant use out of class
        // System.out.println(f1.y);

    }
}

class First {
    int x;
    private double  y;  // now y is private here so we cant use out of the class 
    void test() {
        System.out.println("First test");
    }

    void test2() {
        System.out.println("Second test");
    }

    void test3() {
        System.out.println("Third test");
    }
}
