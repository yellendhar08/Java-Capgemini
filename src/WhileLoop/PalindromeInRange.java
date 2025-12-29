package WhileLoop;

import java.util.Scanner;

public class PalindromeInRange {
    public static void main(String[] args){
        for(int i=100; i<=200; i++){
            int n =i;
            int temp=i;
            int rev=0;
            while (n!=0){
                int digit = n%10;
                rev = rev*10+digit;
                n=n/10;
            }
            if(rev==temp){
                System.out.println(temp+" ");
            }
        }
    }
}
