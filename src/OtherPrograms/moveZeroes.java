package OtherPrograms;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,2,0,43,2};
        int j=0;
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            temp[j++] =0;
        }
        for (int i=0; i<temp.length; i++){
            arr[i] = temp[i];
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
