package yourturn5polymorphismcomplete;

public class Start {
    public static void main (String [] args)
    {
        EverythingClass e1 = new EverythingClass();
        InterfaceOne i1 = e1;
        InterfaceTwo i2 = e1;

        System.out.println("All three reference variables have the address of the same address");
        System.out.println("Run as many methods as you can from e1");
        e1.method1();
        e1.method2();
        e1.method3();
        e1.method4();
        System.out.println("Run as many methods as you can from ie1");
        i1.method1();
        i1.method2();
        System.out.println("Run as many methods as you can from i2");
        i2.method3();
        i2.method4();
        System.out.println("What is the lesson here?");
        System.out.println ("Even though the object pointed to by e1, i1, and i2 is an EverythingClass object that holds all four methods, we can only see the methods that are exposed by the type of the reference variable we access it by");
    }
}
