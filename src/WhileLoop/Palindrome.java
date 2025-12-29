package WhileLoop;

import java.util.Scanner;
//WAJP to check palindrome or not
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int temp =n;
        while (n!=0){
            int digit = n%10;
            sum = sum*10+digit;
            n=n/10;
        }
        System.out.println("Is Palindrome?: "+ (sum==temp));
    }
}

