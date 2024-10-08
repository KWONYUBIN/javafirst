package ch06.lecture.p04constructor;

public class C04This {
    public static void main(String[] args) {
        MyClass04 o = new MyClass04(33, "lee");
        System.out.println(o.age); // 33
        System.out.println(o.name); // lee

        MyClass04 p = new MyClass04(55, "kim");
        System.out.println(p.age);
        System.out.println(p.name);
    }
}

class MyClass04 {
    int age;
    String name;

    // this : 이 클래스로 만들어진 객체의 참조값
    MyClass04(int age, String name) {
        this.age = age;
        this.name = name;
    }
}