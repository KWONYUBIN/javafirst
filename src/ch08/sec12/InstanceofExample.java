package ch08.sec12;

import ch06.sec13.exam03.package1.B;

public class InstanceofExample {
    public static void main(String[] args) {
        //구현 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        //ride() 메소드 호출 시 구현 샛체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    //인터페이스 매개변수를 갖는 메소드
    public static void ride(Venhicle venhicle) {
        // 방법1
//        if(venhicle instanceof Bus) {
//            Bus bus = (Bus) venhicle;
//            bus.checkFare();
//        }

        //방법2
        if (venhicle instanceof Bus bus) {
            bus.checkFare();
        }

        venhicle.run();
    }
}
