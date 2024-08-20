package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean resurt1 = (num1 == num2);  // true
        boolean resurt2 = (num1 != num2);  // false
        boolean resurt3 = (num1 <= num2);  // true
        System.out.println("resurt1: " + resurt1);
        System.out.println("resurt2: " + resurt2);
        System.out.println("resurt3: " + resurt3);

        char char1 = 'A';
        char char2 = 'B';
        boolean resurt4 = (char1 < char2);   // true
        System.out.println("resurt4: " + resurt4);

        int num3 = 1;
        double num4 = 1.0;
        boolean resurt5 = (num3 == num4);   // true
        System.out.println("resurt5: " + resurt5);


        float num5 = 0.1f;
        double num6 = 0.1;
        boolean resurt6 = (num5 == num6);
        boolean resurt7 = (num5 == (float) num6);
        System.out.println("resurt6: " + resurt6);
        System.out.println("resurt7: " + resurt7);

        String str1 = "자바";
        String str2 = "java";
        boolean resurt8 = (str1.equals(str2));
        boolean resurt9 = (!str1.equals(str2));
        System.out.println("resurt8: " + resurt8);
        System.out.println("resurt9: " + resurt9);


    }
}
