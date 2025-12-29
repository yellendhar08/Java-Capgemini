package Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,3,5,6,6};

        for(int i=0 ;i<arr.length; i++){
            boolean isEqual =true;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    isEqual=false;
                    break;
                }
            }
            if(isEqual) System.out.println(arr[i]);
        }
    }
}
