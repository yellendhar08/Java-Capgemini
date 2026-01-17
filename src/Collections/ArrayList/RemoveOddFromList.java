package Collections.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class RemoveOddFromList {
    public static void main(String[] args) {
        int [] arr = {10,21,23,25,26,28,22,23,21,24,25,26};
        List<Integer> al = new ArrayList<>();
        for(int x: arr) {
            al.add(x);
        }

        for(int i=al.size()-1; i>=0; i--){
            if(al.get(i)%2!=0){
                al.remove(i);
            }
        }

        System.out.println("Array List after removing odd numbers");
        System.out.println(al);
    }
}
