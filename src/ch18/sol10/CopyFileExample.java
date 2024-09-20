package ch18.sol10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileExample {
    public static void main(String[] args) {

        File file1 = new File("C:/Temp/dir1/photo1.jpg");
        File file2 = new File("C:/Temp/dir2/photo2.jpg");

        if (file1.exists() == false) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        }
    }
}

