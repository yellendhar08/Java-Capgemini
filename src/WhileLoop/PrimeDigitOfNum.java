package WhileLoop;

import java.util.Scanner;

public class PrimeDigitOfNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n!=0){
            int digit = n%10;
            boolean isPrime = true;
            for(int i=2; i<=digit/2; i++){
                if(digit%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println("Prime number: "+digit);
            n=n/10;
        }
    }
}
