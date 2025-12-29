package WhileLoop;

import java.util.Scanner;

public class EvenDigitOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n!=0){
            int digit = n%10;
            if(digit%2==0){
                System.out.println(digit);
            }
            n=n/10;
        }
    }
}
