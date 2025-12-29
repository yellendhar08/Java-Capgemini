package ForLoops;

//WAJP to print all the prime numbers in  range 14 to 5
public class PrimeInRange {
    public static void main(String[] args){
        for(int i=14; i>=5; i--){
            boolean isPrime = true;
            for (int j=2; j<=i/2; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) System.out.print(i+" ");
        }
    }
}
