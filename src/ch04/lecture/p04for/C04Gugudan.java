package ch04.lecture.p04for;

public class C04Gugudan {
    public static void main(String[] args) {
// 홀수단만 출력
        // 3, 5, 7, 9 단 만
        for (int a = 3; a <= 9; a += 2) {
            System.out.println(a + "단 *****************");
            for (int b = 1; b <= 9; b++) {
                System.out.println(a + " x " + b + " = " + a * b);


            }
        }
    }
}
