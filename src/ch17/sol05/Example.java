package ch17.sol05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = List.of(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        System.out.println("-고전적 반복문-"); // 이걸 먼저 할 줄 알아야 아래 것도 할 수 있음
        for (String item : list) {
            if (item.toLowerCase().contains("java")) {
                System.out.println(item);

            }
        }


        System.out.println("-Stream API-");
        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);

    }
}
