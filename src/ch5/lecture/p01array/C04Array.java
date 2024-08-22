package ch5.lecture.p01array;

public class C04Array {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 3;  // index
        a[1] = 33;
        a[2] = 99;
        a[3] = 101;
        a[4] = 233;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);


        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) { // i는 index 를 줄인말이다.
            System.out.println(a[i]);
        }

    }
}
