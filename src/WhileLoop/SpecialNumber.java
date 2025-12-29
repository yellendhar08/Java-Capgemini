package WhileLoop;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int sum=0;
        int product =1;
        while (n!=0){
            int digit = n%10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        int total = sum+product;
        if(total==temp){
            System.out.println("Special Number");
        }else {
            System.out.println("Not special number");
        }
    }
}
