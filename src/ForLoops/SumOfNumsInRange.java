package ForLoops;

//WAJP to print sum of all the numbers in range 1 to 10
public class SumOfNumsInRange {
    public static void main(String args[]){
        int sum=0;
        for(int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println("Sum of all numbers is: "+sum);
    }
}
