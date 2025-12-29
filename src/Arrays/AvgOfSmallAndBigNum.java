package Arrays;

import java.util.Scanner;

public class AvgOfSmallAndBigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int smallest =Integer.MAX_VALUE;
        int largest =Integer.MIN_VALUE;
        for(int x: arr){
            if(x<smallest){
                smallest=x;
            }
            if (x>largest){
                largest=x;
            }
        }
        int smallCount =0;
        int largeCount =0;

        for(int x:arr){
            if(smallest ==x) smallCount++;
            if(largest ==x) largeCount++;
        }
        double avg = (double) ((smallest * smallCount) + (largest*largeCount)) /(smallCount+largeCount);
        System.out.println(avg);
    }
}
