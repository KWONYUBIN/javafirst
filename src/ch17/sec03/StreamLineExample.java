package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("권유빈", 25),
                new Student("김자반", 15),
                new Student("장유영", 21)
        );

        // 방법1
//        Stream<Student> studentStream = list.stream();
//        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//
//        double avg = scoreStream.average().getAsDouble();

        // 방법2
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }
}
