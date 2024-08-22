package ch04.lecture.p06while;

import java.util.Scanner;

public class sol1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        int balance = 0; //잔고
        while (run) {

            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택>");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.println("예금액> ");
                    int money = scanner.nextInt();
                    balance += money;
                }
                case 2 -> {
                    System.out.println("출금액> ");
                    int money = scanner.nextInt();
                    balance -= money;
                }
                case 3 -> {
                    System.out.println("잔고> " + balance);
                }
                case 4 -> {
                    run = false;
                }
            }
        }
        System.out.println("프로그램 종료");

    }
}
