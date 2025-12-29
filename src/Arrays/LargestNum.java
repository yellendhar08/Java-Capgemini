package Arrays;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int largest =arr[0];
        for(int x: arr){
            if(x>largest){
                largest=x;
            }
        }
        System.out.println("Largest is: "+ largest);
    }
}
