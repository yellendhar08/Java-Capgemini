package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//import java.util.*;

public class Listiterator {
    public static void main(String[] args) {
        String[] names = {"suraj","ram","Lokesh","rita"};
        List<String> al = new ArrayList<>();
        for(String x : names){
            al.add(x);
        }

        ListIterator<String > litr = al.listIterator();

        System.out.println("Forward: ");
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println();
        System.out.println("Backwards: ");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
