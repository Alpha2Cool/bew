package test;

import java.io.File;
import java.util.*;

public class Test {
    public static void main(String[] args) {


        String s = new String("1,2,3,");
        System.out.println(s);
        s=s.substring(0,s.length()-1)+"]";
        System.out.println(s);

        File file = new File("D:\\", "123.txt");
        System.out.println(file.getAbsolutePath());
        file.mkdirs();

    }
}
