package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {

        List<String> immutableList1 = List.of("A", "B", "C");
//        immutableList1.add("D");

        Set<String> immutableSet1 = Set.of("A", "B", "C");
//        immutableSet1.add("D");

        Map<Integer, String> immutableMap1 = Map.of(
                1, "A",
                2, "B",
                3, "C"
        );
//        immutableMap1.put(4,"D");

        //List 컬랙션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        // Set 컬랙션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        // Map 컬랙션을 불변 컬렉션으로 복사
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        // 배열로부터 List 부렵ㄴ 컬렉션 생성
        String[] arr = {"A", "B", "c"};
        List<String> immutableList3 = Arrays.asList(arr);


    }
}
