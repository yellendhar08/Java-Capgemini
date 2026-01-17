package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//WAJP to remove all odd numbers

public class IteratorArrayList {
    public static void main(String[] args) {
        int [] arr = {10,21,23,25,26,28,22,23,21,24,25,26};
        List<Integer> al = new ArrayList<>();
        for(int x: arr) {
            al.add(x);
        }

        Iterator <Integer> itr = al.iterator();
        while(itr.hasNext()){
            int index = itr.next();
            if(index%2!=0){
                itr.remove();
            }
        }
        Iterator <Integer> itr2= al.iterator();
        while (itr2.hasNext()){
            System.out.print(itr2.next()+" ");
        }

//        System.out.println(al);
//        Scanner sc = new Scanner();
        
        


    }
}
