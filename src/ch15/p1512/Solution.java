package ch15.p1512;

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int goodParis = 0;
// 배열의 모든 조합 (i, j)에서 i < j를 만족하는 쌍을 찾음
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // nums[i]와 nums[j]가 같은지 확인
                if (nums[i] == nums[j]) {
                    goodParis++;
                }
            }
        }
        return goodParis;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 1, 1};
        System.out.println(sol.numIdenticalPairs(nums));
    }
}