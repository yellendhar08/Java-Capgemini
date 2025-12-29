package WhileLoop;

import java.util.Scanner;

public class DisariumNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        double sum=0;
        int count=0;
        int t=n;
        while(t!=0){
            count++;
            t=t/10;
        }
        while(n!=0){
            int digit = n%10;
            sum +=Math.pow(digit,count);
            count--;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Disarium Number");
        }else {
            System.out.println("Not a Disarium Number");
        }
    }
}
