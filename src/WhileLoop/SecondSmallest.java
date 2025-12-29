package WhileLoop;

import java.util.Scanner;
//WAJP to finnd second smallest digit in a number
public class SecondSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        while (n!=0){
            int digit = n%10;
            if(digit<smallest){
                second = smallest;
                smallest = digit;
            } else if (digit> smallest && digit <second) {
                second=digit;
            }
            n=n/10;
        }
        System.out.println("Second Smallest: "+second);
    }
}