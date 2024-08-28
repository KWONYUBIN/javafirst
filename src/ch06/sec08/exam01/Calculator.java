package ch06.sec08.exam01;

public class Calculator {
    public static int pi;

    public static int minus(int i, int i1) {
        return i;
    }

    // 리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 리탄값이 없는 메소드 선언
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 호출 시 두 정수 값을 전달받고,
    //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public static int plus(int x, int y) {
        int result = x + y;
        return result;
    }


    // 호출 시 두 정수 값을 전달받고,
    //호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    double divid(int x, int y) {
        double result = (double) x / (double) y;
        return result; // 리턴값 지정;
    }
}
