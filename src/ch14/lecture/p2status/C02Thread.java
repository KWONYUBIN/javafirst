package ch14.lecture.p2status;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드1##########");
            }
        });

        t1.start();

        t1.join(); // t1 쓰레드가 끝나기를 기다림 (다른 쓰레드가 끝나기를 기다리는 코드)
        for (int i = 0; i < 10000; i++) {
            System.out.println("메인쓰레드@@@@@@@@@@");
        }

    }
}
