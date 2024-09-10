package ch15.p2206.Solution;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 배열을 전체 탐색 해서
        // 각 수가 몇 개인지 저장(map)
        for (int num : nums) {
            Integer v = map.getOrDefault(num, 0);
            map.put(num, v + 1);
        }

        // map을 전체 탐색해서 value가 홀 수인 것이 있으면
        // return false
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}