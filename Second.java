public class Second {
    void func1() {
        System.out.println("A");
    }

    void func2() {
        System.out.println("B");
    }

    void func3() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // func1();   //commit due to file error
        // func2();
        // func3(); 
    }
}

// Error Cannot make a static reference to the non-static method func1() from the type Second
// the `main` method must be
// declared as `static`. This is because the `main` method is called by the Java Virtual
// Machine (JVM) to start the execution of the program, and it needs to be able to do so
// without creating an instance of the class.
