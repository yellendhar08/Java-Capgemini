package WhileLoop;

public class StrongNumInRange {
    public static void main(String[] args){
        for(int i=1; i<1000; i++){
            int sum =0;
            int temp =i;
            int n =i;
            while (n!=0){
                int digit = n%10;
                int product = 1;
                for (int j=1; j<=digit; j++){
                    product*=j;
                }
                sum+=product;
                n=n/10;
            }
            if(sum==temp){
                System.out.println(sum+" ");
            }
        }
    }
}
