package map_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap_test {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Eric",180);
        map.put("Josh",177);
        map.put("Tomi",190);
        System.out.println(map.get("Josh")); //返回value
        System.out.println("----------------");
        map.remove("Josh");
        //遍历map
        Set<String> mapK = map.keySet();
        Iterator<String> it = mapK.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("----------------");
        //增强for
        for(String key:mapK){
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("----------------");
        //Entry遍历  Entry就是Key-Value对
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it1 = entries.iterator();
        while(it1.hasNext()){
            Map.Entry<String, Integer> entry = it1.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("----------------");
        //增强for
        for(Map.Entry<String, Integer> en:entries){
            System.out.println(en.getKey()+"="+en.getValue());
        }
    }
}
