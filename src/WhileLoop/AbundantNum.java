package WhileLoop;

import java.util.Scanner;
//Aduntant number = when the sum of factors of the number is greater than the  number itself
public class AbundantNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println("Abundant Number?: "+(sum>n));
    }
}
