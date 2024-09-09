package ch15.lecture.p04;

import java.util.HashSet;
import java.util.Set;

public class C04Equals {
    public static void main(String[] args) {
        Set<Book4> set = new HashSet<>();
        set.add(new Book4("java", "shin"));
        set.add(new Book4("git", "linus"));
        set.add(new Book4("java", "shin"));

        int size = set.size();
        System.out.println("size = " + size);

    }
}

class Book4 {
    private String tilte;
    private String author;

    public Book4(String tilte, String author) {
        this.tilte = tilte;
        this.author = author;
    }
}
