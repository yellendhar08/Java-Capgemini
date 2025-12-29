package WhileLoop;

import java.util.Scanner;
//WAJP to find Second largest in a number
public class SecondLargestDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        while (n!=0){
            int digit = n%10;
            if(digit>largest){
                secondLargest=largest;
                largest=digit;
            } else if (digit <largest && digit >secondLargest) {
                secondLargest=digit;
            }
            n=n/10;
        }
        System.out.println("Second Largest: "+secondLargest);
    }
}
