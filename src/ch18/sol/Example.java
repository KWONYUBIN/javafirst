package ch18.sol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String path = "src/ch18/p7example/Example.java";

        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            try (fr; br) {
                int line = 0;
                String str;
                while ((str = br.readLine()) != null) {
                    line++;
                    System.out.printf("%4d : %s%n", line, str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
