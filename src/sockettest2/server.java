package sockettest2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8001);
        System.out.println("socket open");
        Socket sk = ss.accept();
        System.out.println("accept connect");
        InputStream is = sk.getInputStream();
        byte[] bt = new byte[1024];
        is.read(bt);
        System.out.println(new String(bt));
        OutputStream os = sk.getOutputStream();
        os.write("ack".getBytes());
        sk.close();
        ss.close();
    }
}
