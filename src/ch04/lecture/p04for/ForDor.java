package ch04.lecture.p04for;

public class ForDor {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
                if (a == b) {
                    System.out.println();

                }
            }
        }
    }
}
