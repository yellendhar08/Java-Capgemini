package Recursion;

//WAJP to print all the numbers from 1 to 1000 without using any loop

public class PrintRangeRecursion {
    public static void main(String[] args) {
        int a = 1;
        PrintNum(a);
    }
    public static void PrintNum(int a){
        if(a>1000){
            return;
        }
        System.out.println(a);
        PrintNum(a+1);
    }
}

