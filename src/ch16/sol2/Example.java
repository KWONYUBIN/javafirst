package ch16.sol2;

public class Example {
    private static int[] scores = {10, 50, 3};

    private static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        // 최댓값 구하기
        int max = maxOrMin((a, b) -> a > b ? a : b);
        System.out.println("최댓값 = " + max);

        // 최소값 구하기
        int min = maxOrMin((a, b) -> a < b ? a : b);
        System.out.println("최소값 = " + min);
    }
// 이건 무엇일까요
}
