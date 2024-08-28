package ch06.lecture.p07Package;

import ch06.lecture.p07Package.package1.MyClass01;

public class C03Package {
    public static void main(String[] args) {

        // // 다른 패키지에 있느 클래스 사용 시 import
        MyClass01 o1 = new MyClass01();  //  ch06.lecture.p07Package.package1.MyClass01 이거를
        System.out.println(o1);          // 생략하고싶으면 import에 적으면 됨
    }
}
