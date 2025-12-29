package Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] arr = {123, 456, 789};
        System.out.print("Before Reversed: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int[] rev = ReverseNum(arr);
        System.out.print("After Reversed: ");
        for(int x: rev){
            System.out.print(x+" ");
        }

    }
    public static int[] ReverseNum(int[] arr){
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            int rev =0;
            while (n!=0){
                int digit = n%10;
                rev=rev*10+digit;
                n=n/10;
            }
            arr[i]=rev;
        }
        return arr;
    }
}
