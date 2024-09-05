package ch12.p04redex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class C08Or {
    public static void main(String[] args) {
        // |(파이프) : or

        String p1 = "(a|가)+";
        System.out.println(matches(p1, "a")); // true
        System.out.println(matches(p1, "가")); // true
        System.out.println(matches(p1, "a가가a")); // true

        String p2 = "(ab|가나)+";
        System.out.println(matches(p2, "abab")); // true
        System.out.println(matches(p2, "ab가나")); // true
        System.out.println(matches(p2, "가나가나ab")); // true
        System.out.println(matches(p2, "가a나b")); // false
    }
}
