package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 30),
                new Student("권유빈", 25),
                new Student("신짱구", 5)
        );

        // 방법1
        int sum1 = list.stream()
                .mapToInt(Student::getScore)
                .sum();

        // 방법2
        int sunm2 = list.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1 = " + sum1);
        System.out.println("sunm2 = " + sunm2);
    }
}
