package Arrays;

public class LeadersOfArray {
    public static void main(String[] args) {
        int[] arr = {8,7,4,3,5,2};
        int n = arr.length-1;
        int leader = arr[n];
        int[] temp = new int[n];
        int index =1;
        temp[0]= leader;
        for(int i=n-1; i>=0; i--){
            if(arr[i]>leader){
                temp[index]=arr[i];
                leader=arr[i];
                index++;
            }
        }


        for(int i=index-1; i>=0; i--){
            System.out.print(temp[i]+" ");
        }
    }
}
