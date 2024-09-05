package ch13.sol1;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();
        System.out.println("String value: " + str);

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
        System.out.println("Integer value: " + value);
    }
}
