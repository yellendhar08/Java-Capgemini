package Arrays;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int[] nums = {2,3,4,6};
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<nums.length; i++){
            boolean found = false;
            for(int j=0; j<arr.length;j++){
                if(arr[i]==nums[i]){
                    found=true;
                    break;
                }
            }
            if(!found)System.out.print(nums[i]+" ");
        }
    }
}
