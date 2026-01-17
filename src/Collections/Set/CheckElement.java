package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;

public class CheckElement {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(12,8,9,7,6));
        int element =6;
        boolean isFound= false;
        for(int x : set){
            if(set.contains(element)) {
                isFound = true;
                break;
            }
            }
        if(isFound) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
