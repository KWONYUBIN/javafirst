package ch04.lecture.p04for;

import java.util.Scanner;

public class C02Gugudan3 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0)
                sum += i;
        }
        System.out.println("sum= " + sum);
    }
}

