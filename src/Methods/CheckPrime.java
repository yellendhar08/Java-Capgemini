package Methods;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("isPrime?: "+isPrime(n));
    }
    public static boolean isPrime(int n){
        boolean prime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime) return true;
        return false;
    }

}
