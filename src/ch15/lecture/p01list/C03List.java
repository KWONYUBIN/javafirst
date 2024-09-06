package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C03List {
    public static void main(String[] args) {
        // List : 순서가 있다.
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("css");
        list.add("html");

        System.out.println(list);

        // 같은 객체 여러번 추가 가능
        list.add("java");
        list.add("html");
        System.out.println(list);

        //remove // 지우기
        list.remove("css");
        System.out.println(list);
        list.remove("html");
        System.out.println(list);
        list.remove(2); // 2번 인덱스 지우기
        System.out.println(list);
    }
}
