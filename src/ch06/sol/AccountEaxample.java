package ch06.sol;

public class AccountEaxample {
    public static void main(String[] args) {
        Account12 account = new Account12();

        account.setBalance(10000);
        System.out.println("account = " + account.getBalance());

        account.setBalance(-100);
        System.out.println("account = " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("account = " + account.getBalance());

        account.setBalance(300000);
        System.out.println("account = " + account.getBalance());

    }
}

