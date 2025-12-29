package Methods;

import java.util.Scanner;

public class FindMinElememnt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxNumber = findMin(a,b,c);
        System.out.println("Min Number: "+maxNumber);
    }
    public static int findMin(int a, int b, int c){
        if(a<b && a<c) return a;
        else if(b<a && b<c) return b;
        else return c;
    }
}
