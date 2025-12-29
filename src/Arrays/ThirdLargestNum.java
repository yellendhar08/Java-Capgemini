package Arrays;

public class ThirdLargestNum {
    public static void main(String[] args) {
        int[] arr = {10,20,1,44,5};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int x: arr){
            if(x>first){
                third=second;
                second=first;
                first=x;
            }else if (x>second && x!=first){
                third=second;
                second=x;
            }else if (x>third && x!=second && x!=first){
                third=x;
            }
        }
        System.out.print("Third Largest Num: "+third);
    }
}
