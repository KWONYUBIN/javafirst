package ch13.lecture.p02method;


public class C01GenericMethod {
    public static void main(String[] args) {
        MyClass1 o = new MyClass1();
        o.<String>action1(); // 볼 일 없음
        o.<String>action2();
        String s = o.action2();
        o.<Integer>action2();
        Integer r1 = o.<Integer>action2();
        Integer r2 = o.action2();

        o.<String>action3("java");
        o.action3("java");

        o.<Double, Long>action4(3.14, 5L);
        o.action4(3.14, 5L);

        // 위에 있는 것처럼 타입파라미터를 앞에 쓸 일 없음

    }
}

class MyClass1 {

    // generic method : 타입파라미터가 있는 메소드
    public <T> void action1() {
    }

    public <T> T action2() {
        return null;
    }

    public <T> void action3(T param) {

    }

    public <T, U> void action4(T p1, U p2) {

    }

    public <T> T action5(T p1) {
        return null;
    }
}
