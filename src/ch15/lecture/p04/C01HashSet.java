package ch15.lecture.p04;

import java.util.HashSet;
import java.util.Set;

public class C01HashSet {
    public static void main(String[] args) {
        // Set :  중복된 요소(ekement) 허용하지않음
        Set<String> set = new HashSet<>();

        // add : 추가
        set.add("java");
        set.add("spring");
        set.add("html");

        // contains : 있는 지 확인
        boolean b1 = set.contains("react");
        System.out.println("b1 = " + b1); // false
        boolean b2 = set.contains("react");
        System.out.println("b2 = " + b2); // true

        // size : 원소 수
        System.out.println(set.size());

        // 삭제
        boolean b3 = set.remove("html");
        System.out.println("b3 = " + b3);  // true
        System.out.println(set);
        boolean b4 = set.remove("html");
        System.out.println("b4 = " + b4);
        System.out.println(set);

        // 전체 탐색
    }
}
