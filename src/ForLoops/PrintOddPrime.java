package ForLoops;

//WAJP to print factorials of all numbers in range 1 to 10
public class PrintOddPrime {
    public static  void main(String[] args){
        for(int i=10; i>=1; i--){
            int factorial =1;
            if(i%2!=0){
                for(int j=1; j<i; j++){
                    factorial*=j;
                }
                System.out.println("factorial of "+i+" is "+factorial);
            }
        }
    }
}
