package Arrays;

public class ThirdSmallest {
        public static void main(String[] args) {
            int[] arr = {10,2,15,44,5};
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            int third = Integer.MAX_VALUE;
            for(int x: arr){
                if(x<first){
                    third=second;
                    second=first;
                    first=x;
                }else if (x<second && x!=first){
                    third=second;
                    second=x;
                }else if (x<third && x!=second && x!=first){
                    third=x;
                }
            }
            System.out.print("Third Smallest Num: "+third);
        }
    }

