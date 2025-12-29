package IfElse;

import java.util.Scanner;

public class DigitOrNot {
    public static  void  main(String args[]){
        //wajp to check wheather the given character is digit or not
        System.out.print("Enter character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch>='0' && ch<='9') {
            System.out.println("Given char is a digit");
        } else {
            System.out.println("Given charr is not a digit");
        }
    }
}