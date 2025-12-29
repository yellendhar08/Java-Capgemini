package Arrays;

import java.util.Scanner;
//WAJP to print

public class CountOfEleEqualToAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum=0;
        int count=0;
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int x:arr){
            sum+=x;
        }
        int mean = sum/size;
        for(int x: arr){
            if(x==mean){
                count++;
            }
        }
        System.out.println(count);
    }
}
