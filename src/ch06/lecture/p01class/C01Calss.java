package ch06.lecture.p01class;

public class C01Calss {
    public static void main(String[] args) {
        String a = new String("java");

        var b = new MyClass01();
        var c = new MyClass01();

        int codeA = System.identityHashCode(a);
        System.out.println("codeA = " + codeA);

        int codeB = System.identityHashCode(a);
        System.out.println("codeB = " + codeB);

        int codeC = System.identityHashCode(a);
        System.out.println("codeC = " + codeC);
    }
}

// class (설계도) 만들기
class MyClass01 {

}

