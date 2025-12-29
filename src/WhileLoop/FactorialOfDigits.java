package WhileLoop;

import java.util.Scanner;

public class FactorialOfDigits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while (n!=0){
            int digit = n%10;
            int product=1;
            for (int i=1; i<=digit; i++){
                product*=i;
            }
            n=n/10;
            System.out.println(product+" ");
        }
    }
}

