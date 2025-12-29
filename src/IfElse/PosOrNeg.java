package IfElse;

import java.util.Scanner;

public class PosOrNeg {
    public  static void main(String args[]){
        //WAJP to check given number is Positive or negative or Zero
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Given number is Positive");
        }else if(n<0){
            System.out.println("Given number is negative");
        }else{
            System.out.println("Given number is Zero");
        }
    }
}
