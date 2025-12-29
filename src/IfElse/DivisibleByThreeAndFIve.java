package IfElse;

import java.util.Scanner;

public class DivisibleByThreeAndFIve {
    public static  void  main(String args[]){
        //wajp to check weather the given number divisible by both 3 and 5 or Not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num2 = sc.nextInt();
        if (num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println("Given num is divisible by both 3 and 5");
        } else {
            System.out.println("Given num is not divisble by both 3 and 5");
        }
    }
}
