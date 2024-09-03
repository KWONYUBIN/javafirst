package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((double x, double y) -> {
            double result = x + y;
            return result;
        });

        person.action((double x, double y) -> {
            return x + y;
        });

        person.action((double x, double y) -> x + y);

        person.action((double x, double y) -> {
            return sum(x, y);
        });

        person.action((double x, double y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return x + y;
    }
}
