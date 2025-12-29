package Arrays;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int secondSmallest =smallest;
        for(int x: arr){
            if(x<smallest){
                secondSmallest=smallest;
                smallest=x;
            } else if (x<smallest && x>secondSmallest) {
                secondSmallest=x;
            }
        }
        System.out.println("Second Smallest: "+secondSmallest);
    }
}
