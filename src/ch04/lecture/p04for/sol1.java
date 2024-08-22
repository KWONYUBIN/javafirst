package ch04.lecture.p04for;

public class sol1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------");

        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("-----------------------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------");

        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n % 10);
                n++;
            }
            System.out.println();
        }
    }
}
