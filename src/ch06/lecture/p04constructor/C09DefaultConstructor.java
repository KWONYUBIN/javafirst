package ch06.lecture.p04constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        MyCalss091 o1 = new MyCalss091();
        MyClass092 o2 = new MyClass092();
    }
}

class MyCalss091 {
    // 생성자를 박성하지 않으면
    //파라미터 없는 생성자(no-args constructor)가 자동으로 작성됨
    MyCalss091() {

    }
}

class MyClass092 {
    // 파라미터 없는 생성자 작성시
    // 기본생성자 자동으로 추가되지 않음
    MyClass092(int a) {

    }

    // 파라미터 없는 생성자 필요시
    //작성해야함
    MyClass092() {
        
    }

}