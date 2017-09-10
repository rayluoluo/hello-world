import static java.lang.Math.*;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("total="+Person.total);

        new A();
        new A(3);

		double d = sin(PI*0.45); //double d= Math.sin(Math.PI*0.45);
		System.out.println(d);
    }
}

class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("in static block!");
    }
}

class A {
    {
        System.out.println("in none static block!");
    }
    private int i=5;
    public A() {}
    public A(int a) {
        System.out.println("begin");
        i = a;
        System.out.println("end");
    }
}
