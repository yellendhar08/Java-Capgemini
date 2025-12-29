package ForLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial*=i;
        }
        System.out.print("Factorial of given number is: "+factorial);
    }
}
