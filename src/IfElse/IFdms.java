package IfElse;

import java.util.Scanner;

public class IFdms {
    public static void main(String args[]) {
        //WAJP to check whether the given num is a even or odd using only if dms
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Given number is even number");
        }
        if (a % 2 != 0) {
            System.out.println("Given number is odd number");
        }
    }
}

