package WhileLoop;

import java.util.Scanner;
//WAJP to find smallest in a number
public class SmallestDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        while (n!=0){
            int digit = n%10;
            if(digit<smallest){
                smallest=digit;
            }
            n=n/10;
        }
        System.out.println("Smallest number: "+smallest);
    }
}
