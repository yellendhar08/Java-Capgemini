package Methods;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+"th fibonacci number: "+findNthFib(n));
    }
    public static int findNthFib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int first = 0;
        int second =1;
        int next=0;
        for(int i=2; i<=n; i++){
            next=first+second;
            first=second;
            second=next;
        }
        return next;
    }
}
