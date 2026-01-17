package Collections.Map;

import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class HashMapImplementation {
    public static void main(String[] args) {
        Map map = new HashMap();
        System.out.println(map.put(1, "Kabir"));  //gives null for the first time
        System.out.println(map.put(1, "Kabir"));    //Overrides null for key 1
        System.out.println(map.put(12.2,12.5));
        System.out.println(map.put(1,"Mohit"));  //return previous value of key 1
        System.out.println(map.put(1, "Mohit"));

        System.out.println(map);

        System.out.println(map.remove(1));  //removes and returns key value  pair of key 1
        //we get null if we dont have the specific key we are removing

        System.out.println(map.containsKey(12.2));  //returns true if the key is present
        System.out.println(map.containsValue("Mohit"));
        System.out.println(map.containsValue(12.5));  //returns true if the value is present
        System.out.println(map.containsKey(1));

        System.out.println(map.put(1, "Mohit"));

        System.out.println(map.get(12.2));  //returns values of the key

        //Ways to loop and print

        Set x = map.entrySet();
        System.out.println(x+" ");  //converts all entries of map to set interface

        Set y = map.keySet();
        System.out.println(y+" ");  //prints only keys

        System.out.println();

        Iterator itr = y.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Collection values = map.values();
        System.out.println(values+" ");




    }
}
