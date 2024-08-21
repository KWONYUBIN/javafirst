package ch04.sec07;

public class BreakExample2 {
    public static void main(String[] args) {
        while (true) {
            int n1 = (int) (Math.random() * 6) + 1;
            int n2 = (int) (Math.random() * 6) + 1;

            System.out.println(STR."(\{n1}, \{n2})");

            if ((n1 + n2) == 5) {
                break;
            }

        }
    }

}
