package ch06.lecture.p07Package;

public class C02Package {
    public static void main(String[] args) {
        // 다른 패키지에 있느 클래스 사용 시 패키지명 입력
        ch06.lecture.p07Package.package1.MyClass01 o1
                = new ch06.lecture.p07Package.package1.MyClass01();
        System.out.println(o1);
    }
}
