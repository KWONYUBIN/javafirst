package ch15.lecture.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sol {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }


        while (list.size() > 1) {

            Collections.sort(list, Collections.reverseOrder());

            // 가장 큰 두 돌 꺼내기
            int stone1 = list.remove(0);
            int stone2 = list.remove(0);


            if (stone1 != stone2) {
                list.add(stone1 - stone2);
            }
        }


        return list.isEmpty() ? 0 : list.get(0);
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};


        Solution solution = new Solution();


        int result = solution.lastStoneWeight(stones);
        System.out.println(result);
    }
}
