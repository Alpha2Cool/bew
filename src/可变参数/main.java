package 可变参数;

public class main {
    /*
    当参数列表中参数的个数不确定时，使用可变参数
    可变参数实质时一个数组
    参数中只能有一个可变参数，如果有其他类型参数，可变参数写在最后
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(add(arr));
    }
    public static int add(int...arg)
    {
        System.out.println("数组地址："+arg);
        int sum = 0;
        for (int i:arg) {
            sum+=i;
        }
        return sum;
    }
}
