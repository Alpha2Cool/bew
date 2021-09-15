package fileoutputstream_test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstream_test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("src\\fileoutputstream_test\\b.txt"),true);
        for (int i = 0; i < 5; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.write("====".getBytes());
        fos.close();
    }
}
