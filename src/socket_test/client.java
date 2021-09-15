package socket_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1", 8001);
        OutputStream os = sk.getOutputStream();
        os.write("你好".getBytes());

        InputStream is = sk.getInputStream();
        byte[] bt = new byte[1024];
        int read = is.read(bt);
        System.out.println(new String(bt));
        sk.close();
    }
}
