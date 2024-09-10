package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김자바", 35));
        treeSet.add(new Person("권유빈", 25));

        for (Person person : treeSet) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}
