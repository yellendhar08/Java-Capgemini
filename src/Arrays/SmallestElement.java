package Arrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int smallest =arr[0];
        for(int x:arr){
            if(x<smallest){
                smallest=x;
            }
        }
        System.out.println("Smallest number is: "+smallest);
    }
}
