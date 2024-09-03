package ch16.lecture.p01lambda;

public class C01Lambda {
    public static void main(String[] args) {
        MyInterface o = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("C01Lambda.method1");
            }

            @Override
            public void method2() {
                System.out.println("C01Lambda.method2");
            }
        };
        o.method1();
        o.method2();
    }
}

interface MyInterface {
    void method1();

    void method2();
}
