package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C07Scanner {
    public static void main(String[] args) {
        // 두 실수를 띄어서 입력 받은 후 더한 값 출력
        // nextDouble

        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 띄워서 입력>");
        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();

        System.out.println("더한 값 > " + (v1 + v2));


    }
}
