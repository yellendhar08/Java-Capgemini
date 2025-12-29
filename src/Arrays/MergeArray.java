package Arrays;
//WAJP to merge to two array without Collection.

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,5,6,7};
        int[] nums= {3,2,8,9};
        int[] result = ArrayMerge(arr, nums);
        for(int x: result){
            System.out.print(x+" ");
        }
    }
    public static int[] ArrayMerge(int[] arr, int[] nums){
        int arrn = arr.length;
        int numsn = nums.length;
        int[] merged = new int [arrn+numsn];
        for (int i=0; i<arrn; i++){
            merged[i]=arr[i];
        }
        for (int j=0; j<numsn; j++){
            merged[arrn+j] = nums[j];
        }
        return merged;
    }
}
