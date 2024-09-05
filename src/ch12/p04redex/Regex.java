package ch12.p04redex;

public class Regex {
    public static void main(String[] args) {
        String s = "java is so easy!!!, java is great";
        String r1 = s.replace("java", "자바");
        System.out.println("r1 = " + r1);

        String r2 = r1.replace("Java", "자바");
        System.out.println("r2 = " + r2);

        String r3 = s.replaceAll("[jJ][aA][vV][aA]", "자바");
        System.out.println("r3 = " + r3);

        System.out.println("s = " + s);
    }
}
