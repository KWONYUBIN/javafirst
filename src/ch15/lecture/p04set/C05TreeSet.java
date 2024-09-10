package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(987);
        set1.add(876);
        set1.add(432);
        set1.add(123);
        set1.add(432);
        // HashSet은 넣은 순서랑 관계X
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(987);
        set2.add(876);
        set2.add(432);
        set2.add(123);
        set2.add(432);
        // 큰 수가 뒤로 나옴
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        set3.add("java");
        set3.add("spring");
        set3.add("react");
        set3.add("sql");
        set3.add("hi");

        System.out.println(set3);

        TreeSet<String> set4 = new TreeSet<>();
        set4.add("java");
        set4.add("spring");
        set4.add("react");
        set4.add("sql");
        set4.add("hi");

        System.out.println(set4);
        System.out.println(set4.getFirst());
        System.out.println(set4.getLast());


    }
}
