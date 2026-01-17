package Collections.Set;

import java.util.*;

public class RemoveDup {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,13,null,14,null,15,11,16));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
