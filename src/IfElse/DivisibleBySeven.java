package IfElse;

import java.util.Scanner;

public class DivisibleBySeven {
    public static void main(String args[]){
        //WAJP to check the given numbver is divisible by 7 or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = sc.nextInt();
        if (num1 % 7 == 0) {
            System.out.println("Given number is divisible by 7");
        } else {
            System.out.println("Given number is not divisible by 7");
        }
    }
}
