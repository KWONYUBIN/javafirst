package ch06.lecture.p06final;

import java.util.Arrays;

public class C03Final {
    public static void main(String[] args) {
        final int[] a = {3, 4};
        // a = new int[]{5, 6};  // 불가
        a[0] = 33;
        System.out.println(Arrays.toString(a));
        method1(a);
        System.out.println(Arrays.toString(a));
    }

    static void method1(final int[] a) {
        //   a =new int[]{99, 88}  // 불가
        a[1] = 99;
    }
}
