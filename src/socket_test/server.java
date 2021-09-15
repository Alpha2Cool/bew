package socket_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8001);
        Socket sk = ss.accept();
        InputStream is = sk.getInputStream();
        byte[] bt = new byte[1024];
        int len = is.read(bt);
        System.out.println(new String(bt));
        //回显
        OutputStream os = sk.getOutputStream();
        os.write("收到".getBytes());
        sk.close();
        ss.close();
    }
}
