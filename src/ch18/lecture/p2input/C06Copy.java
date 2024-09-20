package ch18.lecture.p2input;

import java.io.*;

public class C06Copy {
    public static void main(String[] args) {
        String original = "C:/Temp/지구온난화.jpg";
        String target = "C:/Temp/지구온난화3.jpg";

        try {
            InputStream is = new FileInputStream(original);
            OutputStream os = new FileOutputStream(target);

            try (is; os) {
                is.transferTo(os);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
