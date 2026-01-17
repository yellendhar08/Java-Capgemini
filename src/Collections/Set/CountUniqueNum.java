package Collections.Set;
import java.util.*;

public class CountUniqueNum {
    public static void main(String[] args) {
        int[] arr = {1,4,5,1,6,3,5};
        HashSet<Integer> set = new HashSet<>();
        int count=0;

        for(int x : arr){
            if(!set.contains(x))
                set.add(x);
        }
        System.out.println("Count of Unique Numbers: "+set.size());
    }
}
