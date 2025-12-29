package Arrays;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int product =1;
        for(int x: arr){
            product*=x;
        }

        System.out.println("Product of array: "+product);
    }
}
