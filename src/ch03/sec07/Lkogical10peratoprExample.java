package ch03.sec07;

public class Lkogical10peratoprExample {
    public static void main(String[] args) {
        int charCod = 'A';
        //int charCod = 'a';
        //int charCod = '5';


        if ((65 <= charCod) & (charCod <= 90)) {
            System.out.println("대문자군요.");
        }
        if ((97 <= charCod) && (charCod <= 122)) {
            System.out.println("소문자군요.");
        }
        if ((48 <= charCod) && (charCod <= 57)) {
            System.out.println("0~9 숫자이군요.");
        }
        // -------------------------------------------

        int value = 6;
        //int value = 7;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수이군요");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2또는 3의 배수가 아니군요.");
        }
    }
}
