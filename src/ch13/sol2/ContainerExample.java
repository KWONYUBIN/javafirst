package ch13.sol2;


public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println("name1 = " + name1); // 홍길동
        System.out.println("job = " + job); // 도적

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
        System.out.println("name2 = " + name2); // 홍길동
        System.out.println("age = " + age); // 35

    }
}
