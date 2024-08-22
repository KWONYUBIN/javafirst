package ch5.lecture.p01array;

public class C02Array {
    public static void main(String[] args) {


        int[] a;  // a라는 배열 변수 선언
        a = new int[3]; // 3개의 값 저장 가능한 공간 생성

        a[0] = 33;
        a[1] = 44;
        a[2] = 55;
        // a[3] = 66; // Exception  저장가능 공간을 넘어가면 안 됨

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);


    }
}
