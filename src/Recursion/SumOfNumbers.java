package Recursion;
//WAJP to print sum of all the numbers from range 1 to 5 without using any loop

public class SumOfNumbers {
    public static void main(String[] args) {
        int a =1;
        System.out.println(FindSum(a));
    }
    public static int FindSum(int a){
        int sum=0;
        if(a==5){
            return 5;
        }
        return a+FindSum(a+1);
    }
}
