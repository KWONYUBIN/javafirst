package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        // 실수 두개 입력받아서 더한값 출력하기

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자1>");
        String num1 = scanner.nextLine();

        System.out.print("숫자2>");
        String num2 = scanner.nextLine();

        double v1 = Double.parseDouble(num1);
        double v2 = Double.parseDouble(num2);

        System.out.println("결과값> " + (v1 + v2));


    }
}
