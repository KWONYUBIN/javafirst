package ch16.lecture.p01lambda;

public class C03Lambda {
    public static void main(String[] args) {

        // lambda 식 : (파라미터 목록) -> {메소드 몸통}
        // : Functional Interface 의 익명클래스 객체
        MyInterface3 o = () -> {
            System.out.println("안녕 람다");
        };  // {} 이것은 메소드 몸통이라고 함
        o.some();
    }
}

//  Functional Interface : 추상메소드가 하나인 인터펜이스
interface MyInterface3 {
    void some();
}