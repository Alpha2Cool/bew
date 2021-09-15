package fileinputstream_test;

import java.io.FileReader;
import java.io.IOException;

public class filereader_test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\fileoutputstream_test\\a.txt");
        int len = 0;
        while ((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        fr.close();
    }
}
