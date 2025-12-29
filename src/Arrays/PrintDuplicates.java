package Arrays;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,5};
        for(int i=0; i<arr.length; i++){
            boolean duplicate = false;
//            int k=arr[i];
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    duplicate=true;
                    break;
                }
            }
            if(duplicate) System.out.print(arr[i]+" ");
        }
    }
}
