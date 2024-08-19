package ch02.lecture.p04conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        // type conversion (형변환)

        // 자동 ; 작은공간의값 -> 큰공간
        // 강제 : 큰공간의값 -> 작은공간

        // 자동
        // 정수형 사이
        int a = 21_0000_0000;
        long b = a; // 자동 형변환 ok
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 강제 : 매우매우 주의해서 사용!!!
        short c = (short) a; // 자동형변환 XXX. 강제형변환 ok
        System.out.println("c = " + c);
        int d = 21_0000_0000;
        short e = (short) d; // 강제형변환, 값을 잃을 수 있음
        System.out.println("e = " + e);
    }
}
