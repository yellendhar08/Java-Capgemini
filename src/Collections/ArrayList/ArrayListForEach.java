package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListForEach {
    public static void main(String[] args) {
        int[] arr =  {1,5,7,9,3};
        List<Integer> al = new ArrayList<Integer>();
        for(int i : arr){
            al.add(i);
        }
        List<Integer> al2 = Arrays.asList(1,2,4,6,8);
        al.add(10);
        for( int x :al) {
            System.out.print(x+" ");
        }
//        al2.add(10);
//        System.out.println(al2);  //Exception


    }
}
