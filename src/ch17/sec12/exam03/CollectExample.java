package ch17.sec12.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍갈동", "남", 92));
        list.add(new Student("김수영", "여", 87));
        list.add(new Student("김자바", "남", 95));
        list.add(new Student("어해영", "여", 93));

        Map<String, Double> map = list.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getSex(),
                                Collectors.averagingDouble(s -> s.getScore())
                        )
                );
        System.out.println(map);
    }
}
