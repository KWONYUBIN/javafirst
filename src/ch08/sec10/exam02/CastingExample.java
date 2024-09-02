package ch08.sec10.exam02;

import ch06.sec13.exam03.package1.B;

public class CastingExample {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();

        vehicle.run();

//        vehicle.checkFare();  // 안 돼서 강제형변환 시킴

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
