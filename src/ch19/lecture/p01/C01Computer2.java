package ch19.lecture.p01;

import java.io.InputStream;
import java.net.Socket;

public class C01Computer2 {
    public static void main(String[] args) throws Exception {
        // client (연결하는쪽)
        // Socket (ex 연결하는 구멍)
        Socket socket = new Socket("172.30.1.5", 9999);

        InputStream is = socket.getInputStream();

        try (is; socket) {
            int data = is.read();

            System.out.println((char) data);
        }
    }
}