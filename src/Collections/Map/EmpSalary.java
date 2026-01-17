package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class EmpSalary {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(101, 75000);
        map.put(102,50001);
        map.put(103,35000);
        map.put(104,45000);

        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer, Integer> key = itr.next();
            if(key.getValue()>50000){
                System.out.println(key.getKey()+" --> "+key.getValue());
            }
        }

    }
}
