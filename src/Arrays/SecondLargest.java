package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int largest =arr[0];
        int secondLargest = largest;
        for (int x :arr){
            if(x>largest){
                secondLargest=largest;
                largest=x;
            } else if (x<largest && x>secondLargest) {
                secondLargest=x;
            }
        }
        System.out.println("Second Largest: "+ secondLargest);
    }
}
