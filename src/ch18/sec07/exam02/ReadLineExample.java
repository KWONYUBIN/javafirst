package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("src/ch18/sec07/exam02/ReadLineExample.java")
        );
        try (br) {
            int lineNumber = 1;
            while (true) {
                String str = br.readLine();
                if (str == null) {
                    break;
                }
                System.out.println(lineNumber + "\t" + str);
                lineNumber++;
            }
        }
    }
}
