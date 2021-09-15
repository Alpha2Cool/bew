package copyimage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyimage_test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\XiaoMI\\Desktop\\gy.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\XiaoMI\\Desktop\\gy1.jpg");
        int len = 0;
        while((len = fis.read())!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}
