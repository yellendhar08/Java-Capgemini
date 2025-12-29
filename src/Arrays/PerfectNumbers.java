package Arrays;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int sum=0;
            int temp=arr[i];
            for(int j=1; j<arr[i]; j++){
                if(arr[i]%j==0){
                    sum+=j;
                }
            }
            if(sum==temp){
                System.out.println(arr[i]+" is perfect number");
            }
        }
    }
}
