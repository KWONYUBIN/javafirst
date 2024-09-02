package ch08.lecture.p03cast;

public class C02Cast {
    public static void main(String[] args) {
        Myinterface2 o = new Myclass21();
        if (o instanceof Myclass21) {

            //만약 o가 가리키는 객체가 MyClass21 타입이면
            Myclass21 a = (Myclass21) o; // ok

        }

        if (o instanceof Myclass22) {

            // 만약 o 객체가 MyClass22 타입이면
            Myclass22 b = (Myclass22) o; // not ok (ClassCastException)
        }

        System.out.println("다음 코드");
    }
}

// @formatter:Off
interface Myinterface2 {}
class Myclass21 implements Myinterface2 {}
class Myclass22 implements Myinterface2 {}