package ch06.sol;

import java.util.Scanner;

public class BankApp {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("---------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            } else {
                System.out.println("다시 시도하세요");
            }
        }
        System.out.println("프로그램 종료");
    }

    // 계좌생성
    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");
        System.out.println("계좌번호: ");
        String accountNumber = scanner.next();
        System.out.println("계좌주: ");
        String owner = scanner.next();
        System.out.println("초기입금액");
        int balance = scanner.nextInt();

        Account newAccount = new Account(accountNumber, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록
    private static void accountList() {
        System.out.println("--------");
        System.out.println("계좌 목록");
        System.out.println("--------");
        for (Account account : accountArray) {
            if (account != null) {
                System.out.print("계좌번호: " + account.getAccountNumber());
                System.out.print(" | 계좌주: " + account.getOwner());
                System.out.println(" | 잔고: " + account.getBalance());
            }
        }
    }

    // 예금
    private static void deposit() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        System.out.print("예금액: ");
        int amount = scanner.nextInt();

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("예금이 성공되었습니다.");
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    // 출금
    private static void withdraw() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        System.out.print("출금액: ");
        int amount = scanner.nextInt();

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("출금이 성공되었습니다.");
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    // 계좌 찾기
    private static Account findAccount(String accountNumber) {
        for (Account account : accountArray) {
            if (account != null && account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}