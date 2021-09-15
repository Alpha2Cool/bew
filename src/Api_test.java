import java.util.ArrayList;

public class Api_test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
        System.out.println(arr);

        String str = "Hello,world,ha,ha";
        str.replace("o","*");
        System.out.println(str);
        String str1 = str.replace("o","*");
        System.out.println(str1);

        String[] str2 = str.split(",");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
    }
}
