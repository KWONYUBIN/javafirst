package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String original = "C:/Temp/박스강아지.jpg";
        String target = "C:/Temp/박스강아지2.jpg";

        InputStream is = new FileInputStream(original);
        OutputStream os = new FileOutputStream(target);

        byte[] data = new byte[1024];
        while (true) {
            int num = is.read(data);
            if (num == -1) break;
            os.write(data, 0, num);
        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
