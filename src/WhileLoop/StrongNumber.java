package WhileLoop;

import java.util.Scanner;

//WAJP to check whether the given number is Strong Number or not
public class StrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        while (n!=0){
            int product=1;
            int digit = n%10;
            for(int i=1; i<=digit; i++){
                product*=i;
            }
            sum+=product;
            n=n/10;
        }
        System.out.println("Strong Number?: "+(sum==temp));
    }
}

