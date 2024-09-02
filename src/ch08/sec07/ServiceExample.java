package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {

        Service service = new ServiceImpl();

        service.deflaultMethod1();
        System.out.println();
        service.deflaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();

    }
}
