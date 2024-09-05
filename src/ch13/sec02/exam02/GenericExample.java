package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        CarAgency carAgency = new CarAgency();

        Home home = homeAgency.rent();
        Car car = carAgency.rent();

        home.turnOnLight();
        car.run();


    }
}
