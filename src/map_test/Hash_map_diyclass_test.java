package map_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash_map_diyclass_test {
    public static void main(String[] args) {
        HashMap<person, Integer> personIntegerHashMap = new HashMap<>();
        personIntegerHashMap.put(new person("eric"),18);
        personIntegerHashMap.put(new person("josh"),20);
        personIntegerHashMap.put(new person("bell"),21);
        personIntegerHashMap.put(new person("eric"),19);

        Set<person> people = personIntegerHashMap.keySet();
        Iterator<person> iterator = people.iterator();
        while(iterator.hasNext()){
            person key = iterator.next();
            System.out.println(key.getName()+"="+personIntegerHashMap.get(key));
        }
    }
}
