package ch17.sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("권유빈", "남", 90));
        list.add(new Student("장유영", "여", 95));
        list.add(new Student("이준영", "남", 80));
        list.add(new Student("조아람", "여", 85));

        Map<String, List<Student>> map = list.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );

        List<Student> mList = map.get("남");
        mList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> fmList = map.get("여");
        fmList.stream().forEach(s -> System.out.println(s.getName()));

    }
}
