package exception_test;

import java.io.FileNotFoundException;
import java.util.Comparator;

public class try_catch_test {
    public static void main(String[] args) {
        String path = "d:\\a.t";
        try {
            openFilet(path);  //出现异常后，不再把异常抛给JVM处理，而是自己处理，调用catch中的方法
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("后续代码继续执行");
    }
    public static void openFilet(String filepath) throws FileNotFoundException {
        if(!filepath.equals("d:\\a.txt")){
            //文件不存在为编译时异常，必须提前声明throws
            throw new FileNotFoundException("文件不存在");
        }
    }
    Comparator<Integer> c = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    };
}
