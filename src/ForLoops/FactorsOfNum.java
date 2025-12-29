package ForLoops;

import java.util.Scanner;
//WAJP to print all the factors of a num
public class FactorsOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}