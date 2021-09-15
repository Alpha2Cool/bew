package fileoutputstream_test;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter_test {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\fileoutputstream_test\\c.txt");
        fw.write(99);  //将字符流写入内存中，而不是直接写入文件中
        fw.flush();  //将内存中的数据刷新到文件中
        fw.close();  //如果不写flush但写了close也可以将数据从内存中刷新到文件中
    }
}
