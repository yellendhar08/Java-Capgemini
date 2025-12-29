package ForLoops;

//WAJP to print factorials in range 1 to 10 and 10 to 1
public class FactorialInRange {
    public static void main(String[] args){

        System.out.println("---From Range 1 to 10---");
        for(int i=1; i<=10;i++){
            int factorial =1;
            for(int j=1; j<i; j++){
                factorial*=j;
            }
            System.out.println("Factorial of "+i+ " is "+factorial);
        }
        System.out.println("---From Range 10 to 1---");
        for(int i=10; i>=1;i--){
            int factorial =1;
            for(int j=1; j<i; j++){
                factorial*=j;
            }
            System.out.println("Factorial of "+i+ " is "+factorial);
        }
    }
}
