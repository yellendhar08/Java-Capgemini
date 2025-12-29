package Recursion;

//WAJP to print all the numbers in range 500 to 50 without using any loop

public class reverseNum {
    public static void main(String[] args) {
        int a = 500;
        PrintRev(a);
    }
    public static void PrintRev(int a){
        if(a<50){
            return;
        }
        System.out.println(a);
        PrintRev(a-1);
    }
}
