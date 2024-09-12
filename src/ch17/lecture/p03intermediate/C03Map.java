package ch17.lecture.p03intermediate;

import java.util.List;

public class C03Map {
    public static void main(String[] args) {
        // map : 다른 값으로 변환(mapping)

        List<String> list = List.of("안유진", "카리나", "권유빈", "장원영", "백지헌");

        list.stream()
                .map(e -> e.substring(1)) // 성만 빼고 출력
                .forEach(System.out::println);

        list.stream()
                .map(e -> e.substring(0, 1)) // 성만 출력
                .forEach(System.out::println);

    }
}
