package Arrays;

public class CountOfEleDivByK {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int k=3;
        int count=0;
        for (int x:arr){
            if(x%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
