package ch06.lecture.p05static;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01 o2 = new MyClass01();
        o1.age = 30;
        o2.age = 40;

        System.out.println(o1.age);
        System.out.println(o2.age);
    }
}

class MyClass01 {
    int age;  //  instance field
}