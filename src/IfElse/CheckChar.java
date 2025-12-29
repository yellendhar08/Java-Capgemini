package IfElse;

import java.util.Scanner;

public class CheckChar {
    public static void main(String args[]){
        //WAJP to check whether given char is a uppercase, lowercase, digit or a special character
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        if(c>='A' && c <='Z'){
            System.out.println("Character is in UpperCase");
        }else if(c>='a' && c<='z'){
            System.out.println("Character is in LowerCase");
        }else if(c>='0' && c<='9'){
            System.out.println("Character is a digit");
        }else{
            System.out.println("Given Character is a special character");
        }
    }
}
