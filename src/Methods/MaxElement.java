package Methods;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxNumber = findMax(a,b,c);
        System.out.println("Max Number: "+maxNumber);
    }
    public static int findMax(int a, int b, int c){
        if(a>b && a>c) return a;
        else if(b>a && b>c) return b;
        else return c;
    }
}
