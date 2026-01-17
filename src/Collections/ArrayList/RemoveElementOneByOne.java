package Collections.ArrayList;

import java.util.ArrayList;
import  java.util.Iterator;

public class RemoveElementOneByOne {
    public static void main(String[] args) {
        int[] arr = {10,21,23,25,26};
        ArrayList<Integer> al = new ArrayList<>();
        for(int x: arr){
            al.add(x);
        }

        Iterator <Integer> itr = al.iterator();
        while (itr.hasNext()){
            itr.next();
            itr.remove();
            System.out.println(al);
        }

    }
}
