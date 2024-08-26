package ch06.lecture.p03method;

public class C03Method {
    public static void main(String[] args) {
        Myclass03 a = new Myclass03();
        a.name = "흥민";

        Myclass03 b = new Myclass03();
        b.name = "홀란드";
        
        a.printName();
        b.printName();

    }
}


class Myclass03 {
    // field
    String name; // null 1

    public void printName() {
        System.out.println(name + "입니다.");
    }
}