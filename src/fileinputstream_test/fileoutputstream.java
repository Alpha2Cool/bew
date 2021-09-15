package fileinputstream_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class fileoutputstream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\fileinputstream_test\\a.txt");
        int s  = 0;
        while ((s = fis.read())!=-1){   //当读取结束时，read()返回-1
            System.out.print((char)s);
        }
        System.out.println();

        FileInputStream fis2 = new FileInputStream("src\\fileinputstream_test\\b.txt");
        byte[] bt = new byte[3];
        int len = fis2.read(bt);//返回长度，数据放在了bt里
        System.out.println(Arrays.toString(bt));
        System.out.println(new String(bt));  //将字节数组转换为字符串
        fis.close();
        fis2.close();
    }
}
