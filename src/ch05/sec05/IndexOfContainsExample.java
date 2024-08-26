package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subeject = "자바 프로그래밍";

        int location = subeject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subeject.substring(location);
        System.out.println(substring);

        location = subeject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subeject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
