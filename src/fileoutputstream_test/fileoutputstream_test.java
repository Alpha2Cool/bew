package fileoutputstream_test;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstream_test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\fileoutputstream_test\\a.txt");
        fos.write(97);  //写入一个字节

        byte[] bt = {49,48,48};
        fos.write(bt);

        byte[] cn = "你好".getBytes();
        fos.write(cn);
        fos.close();
    }
}
