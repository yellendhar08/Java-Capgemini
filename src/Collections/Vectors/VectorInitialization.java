package Collections.Vectors;

import java.util.List;
import java.util.Vector;
import java.util.Iterator;

public class VectorInitialization {
    public static void main(String[] args) {
        List<String> vec = new Vector<>();
        vec.add("Rahul");
        vec.add("Suraj");
        vec.add("Neeraj");
        System.out.println(vec);
        System.out.println(vec.size());

        for(int i=0; i<vec.size(); i++){
            System.out.print(vec.get(i)+" ");
        }

        Iterator<String> itr = vec.iterator();
        System.out.println();
        System.out.println();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
