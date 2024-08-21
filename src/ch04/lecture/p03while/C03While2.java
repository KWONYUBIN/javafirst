package ch04.lecture.p03while;

public class C03While2 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        while (i <= 100) { // 1 <= 100 조건으로 수정
            if (i % 3 == 0) { // 3의 배수인지 확인
                sum += i; // 3의 배수이면 sum에 더함
            }
            i++; // 반복 변수 i를 증가시킴
        }

        System.out.println("1부터 100까지의 정수 중 3의 배수의 총합: " + sum);
    }
}
