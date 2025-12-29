package ForLoops;

import java.util.Scanner;

//WAJP to check whether the given num is prime or not
public class CheckPrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Given number is prime number");
        }else {
            System.out.println("Given numer is not a prime number");
        }
    }
}

