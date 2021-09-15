package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 3, 2, 1);    //批量add
        Iterator it = list.iterator();
        System.out.println(list.toString());
        Collections.shuffle(list);      //打乱list
        System.out.println(list.toString());

        Collections.sort(list);   //排序
        System.out.println(list.toString());
    }
}
