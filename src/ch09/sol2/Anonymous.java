package ch09.sol2;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    void method1() {
        Vehicle var = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };

        var.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
