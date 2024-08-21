package ch04.lecture.p02switch;

import ch02.exercise.Solusion10;

public class C08Bracket {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3) + 1;
        System.out.println("n = " + n);


        switch (n) {
            case 1:
                System.out.println("첫째");
                break;
            case 2:
                System.out.println("둘째");
                break;
            case 3:
                System.out.println("셋째");
                break; //생략가능
        }
    }
}
