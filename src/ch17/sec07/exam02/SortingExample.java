package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class SortingExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("권유빈", 25));
        list.add(new Student("히나타", 17));
        list.add(new Student("신짱구", 5));

        list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(System.out::println);

        list.stream()
                .sorted(comparingInt(Student::getScore))
                .forEach(System.out::println);

        // 점수 내림차순
        System.out.println();
        list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(System.out::println);

        list.stream()
                .sorted(comparingInt(Student::getScore).reversed())
                .forEach(System.out::println);

    }
}
