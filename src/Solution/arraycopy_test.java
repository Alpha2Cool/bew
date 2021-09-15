package Solution;

import java.util.Arrays;

public class arraycopy_test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        System.arraycopy(arr1,0,arr2,0,3);  //注意没有返回值

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
