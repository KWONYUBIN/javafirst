package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C03Scanner {
    public static void main(String[] args) {
        // 정수 두개 입력받아서 더한값 출력하기

        Scanner scanner = new Scanner(System.in);

        System.out.print("수1>");
        String num1 = scanner.nextLine();

        System.out.print("수2>");
        String num2 = scanner.nextLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        //  System.out.println("더한 결과:" + (num1 + num2));
        System.out.println("더한 결과:" + (n1 + n2));

    }
}
