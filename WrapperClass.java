//VVI Topic 

// Almost 100% Object oriented programming language is java not accurate 100% but almost because of predefined data types like int, float, char etc!
// Java give us some method to make it 100 OOPs when we use wrapper classes!
// Object Oriented Programming Language means where we only talk about class and object 
public class WrapperClass {
    public static void main(String[] args) {
        int x = Integer.parseInt("123");         // It is Statics
        Integer x1 = Integer.valueOf("101101",2);   //It is Statics
        int y = x1.intValue();                     // It is Non-Statics
        System.out.println(x);
        System.out.println(y);
        Double x2 = Double.parseDouble("456");     // It is Statics
        Double x3 = Double.valueOf("56");   // It is Statics
        double z = x3.doubleValue();    // It is Non-Statics
        System.out.println(x2);
        System.out.println(z);
    }
}


//Note: We use a wrapper class to convert premitive data types to non-primitive data types or non-premitive to premitive data types
