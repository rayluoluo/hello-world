public class TestOverload {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Person {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name,18);
    }

    public Person(int age) {
        this("Anonymous",age);
    }
}