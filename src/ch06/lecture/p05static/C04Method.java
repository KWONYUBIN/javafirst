package ch06.lecture.p05static;

public class C04Method {
    public static void main(String[] args) {
        MyClass04.method();
        double r = Math.random();
        System.out.println(r);

        int abs = Math.abs(-99);
        System.out.println(abs);

        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}

class MyClass04 {
    static void method() {
        System.out.println("MyClass04.method");
    }
}