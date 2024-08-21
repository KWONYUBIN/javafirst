package ch04.lecture.p04for;

public class C05Gugudan {
    public static void main(String[] args) {
        // 9~2단순으로
        for (int a = 9; a >= 2; a--) {
            System.out.println(STR."\{a}단 *****************");
            for (int b = 1; b <= 9; b++) {
                System.out.println(STR."\{a} X \{b} = \{a * b}");
            }
        }
    }
}
