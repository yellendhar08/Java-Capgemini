package Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5};
        int[] nums = {2,3,4,6};
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<nums.length; j++){
                if(arr[i]==nums[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
