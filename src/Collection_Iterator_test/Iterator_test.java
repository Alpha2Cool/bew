package Collection_Iterator_test;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_test {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Integer> coll = new ArrayList<>();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        //用迭代器循环遍历
        Iterator<Integer> it = coll.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("==============");
        //或for循环
        for (Iterator<Integer> it1 = coll.iterator(); it1.hasNext(); ) {
            System.out.println(it1.next());
        }
        System.out.println("==============");
        //增强for循环
        for (Integer  x: coll) {  //Integer也可改为int,自动装箱自动拆箱
            System.out.println(x);
        }
    }
}
