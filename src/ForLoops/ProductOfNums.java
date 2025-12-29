package ForLoops;

//WAJP to print product of all the numbers in range 1 to 10
public class ProductOfNums {
    public static void main(String args[]){
        int product =1;
        for(int i=1; i<=10; i++){
            product*=i;
        }
        System.out.println("Product of nums: "+product);
    }
}
