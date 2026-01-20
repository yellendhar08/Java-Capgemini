package LambdaFunction;

import java.util.ArrayList;
import  java.util.Arrays;
import  java.util.List;

interface Func{
    int add(int a, int b);
}

public class UsingLambda {
    public static void main(String[] args) {
        Func ref = (a,b) -> (a*b);
        System.out.println("Using Lambda: "+ref.add(10,6));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Rahul","Mohit","Rohit","Nohit"));
        names.forEach(name -> System.out.println(name+" "));


    }
}
