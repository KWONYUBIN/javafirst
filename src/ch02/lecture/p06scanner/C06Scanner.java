package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C06Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 줄이 띄워서 입력>");
//        String n1 = scanner.next();
//        String n2 = scanner.next();
//
//        int v1 = Integer.parseInt(n1);
//        int v2 = Integer.parseInt(n2);

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        // System.out.println("더한 값 = " + (n1 + n2));
        System.out.println("더한 값 > " + (v1 + v2));


    }
}
