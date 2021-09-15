package exception_test;

import java.io.FileNotFoundException;

public class throws_test {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = new int[3];
        show(arr,2);
        System.out.println("==========");
        String path = "d:a.txt";
        openFilet(path); //在这里，也需要在main程序定义处声明throws
    }

    public static void show(int arr[], int index){
        if(index<0 ||  index>arr.length-1){
            //这个异常为RuntimeException，因此不需要声明throws
            throw new ArrayIndexOutOfBoundsException("超出索引范围");
        }
    }

    public static void openFilet(String filepath) throws FileNotFoundException {
        if(!filepath.equals("d:\\a.txt")){
            //文件不存在为编译时异常，必须提前声明throws
            throw new FileNotFoundException("文件不存在");
        }
    }
}
