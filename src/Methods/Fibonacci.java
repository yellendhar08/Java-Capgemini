package Methods;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
        fibonacci(a);
    }

    public static void fibonacci(int a){


        int first =0;
        int second = 1;
        for(int i=1; i<=a; i++){
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second=next;
        }
    }
}

