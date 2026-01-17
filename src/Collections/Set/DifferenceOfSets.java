package Collections.Set;

import java.util.HashSet;

public class DifferenceOfSets {
    public static void main(String[] args) {
        int[] arr = {1,2,8,6,7};
        int[] nums = {1,6,5,9,3};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int x : arr){
            set1.add(x);
        }
        for(int y : nums){
            set2.add(y);
        }

        System.out.print("Elements present in set1 but not in set2: ");
        for(int x : set1){
            if(set1.contains(x) && !set2.contains(x)){
                System.out.print(x+" ");
            }
        }

    }
}
