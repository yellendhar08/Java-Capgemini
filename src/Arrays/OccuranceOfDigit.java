package Arrays;

public class OccuranceOfDigit {
    public static void main(String[] args) {
        int[] arr = {37,823,122, 2322, 6017};
        int k=2;
        int result =digitFind(arr, k);
        System.out.println("Number with max "+k+" is "+ result);

    }

    public  static int digitFind(int[] arr, int k){
        int size= arr.length;
        int max =Integer.MIN_VALUE;
        int number =-1;
        for(int i=0; i<size; i++){
            int n=arr[i];
            int count=0;

            while (n!=0){
                int digit = n%10;
                if(digit==k){
                    count++;
                }
                n=n/10;
            }
            if(count>max){
                max=count;
                number=arr[i];
            }
        }
        return number;
    }
}
