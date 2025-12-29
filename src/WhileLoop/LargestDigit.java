package WhileLoop;
//WAJP to find largest in a number

import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int smallest = Integer.MIN_VALUE;
        while (n!=0){
            int digit = n%10;
            if(digit>smallest){
                smallest=digit;
            }
            n=n/10;
        }
        System.out.println("Largest number: "+smallest);
    }
}
