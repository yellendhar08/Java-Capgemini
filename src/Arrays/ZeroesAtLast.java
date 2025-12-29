package Arrays;

import java.util.Scanner;

public class ZeroesAtLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.println();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[arr.length];
        int j =0;
        for(int x:arr){
            if(x!=0){
                temp[j]=x;
                j++;
            }
        }
        while(j<n){
            temp[j++]=0;
        }
        for(int i =0; i<arr.length;i++){
            arr[i]= temp[i];
        }
        for(int x: arr) {
            System.out.print(x+" ");
        }
    }
}
