package ch14.lecture.p2status;

public class C01Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드1@@@@@@@@@");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500); // 실행 멈춤
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("쓰레드2##########");
            }
        });

        t1.start();
        t2.start();

    }
}
