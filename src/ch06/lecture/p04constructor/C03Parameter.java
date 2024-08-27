package ch06.lecture.p04constructor;

public class C03Parameter {
    public static void main(String[] args) {
        Myclass03 o1 = new Myclass03(1, "guest");
        Myclass03 o2 = new Myclass03(10, "son");

        System.out.println(o1.age);
        System.out.println(o1.name);

        System.out.println(o2.age);
        System.out.println(o2.name);

    }
}

class Myclass03 {
    int age;
    String name;


    Myclass03(int agePara, String namePara) {
        age = agePara;
        name = namePara;
    }
}