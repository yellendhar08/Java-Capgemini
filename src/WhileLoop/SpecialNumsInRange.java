package WhileLoop;

import java.util.Scanner;

public class SpecialNumsInRange {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
            for(int i=1; i<=100; i++) {
                int sum = 0;
                int product=1;
                int n = i;
                int temp = i;
                while (n != 0) {
                    int digit = n % 10;
                    sum+=digit;
                    product*=digit;
                    n=n/10;
                }
                if(sum+product==temp){
                    System.out.println(temp+" ");
                }
            }
    }
}
