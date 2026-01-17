package Collections.Set;

import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(2,3,5,9,8));
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            int n = itr.next();
            if(n%2==0){
                itr.remove();
            }
        }
        System.out.println(set);
    }
}
