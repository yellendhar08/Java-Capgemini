package WhileLoop;

import java.util.Scanner;

public class SumOFOddDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int sum=0;
            while(n!=0){
                int digit = n%10;
                if(digit%2!=0){
                    sum+=digit;
                }
                n=n/10;
            }
        System.out.println(sum);
        }
    }