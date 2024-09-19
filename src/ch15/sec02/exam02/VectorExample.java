package ch15.sec02.exam02;


import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
        List<Board> l1 = new ArrayList<>();
        //Collections.synchronizedList
        List<Board> list = Collections.synchronizedList(l1);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(new Board("제목", "내용", "글쓴이"));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(new Board("제목", "내용", "글쓴이"));
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("list.size() = " + list.size());
    }
}