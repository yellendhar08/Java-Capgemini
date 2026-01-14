package Collections;

import java.util.*;
public class ArrayListString {
    public static void main(String[] args) {
        String[] str = {"chintu", "Girish","Pawan","Balaji"};

        List <String> al = new ArrayList<>();
        for(String s : str){
            al.add(s);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name to find: ");
        String name = sc.nextLine();

        if(al.contains(name)){
            int index = al.indexOf(name);
            System.out.println("Present at index: "+index);
        }else {
            System.out.println("Not Present");
        }
    }
}
