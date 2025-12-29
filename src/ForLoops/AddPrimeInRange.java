package ForLoops;
//WAJP to print addition of all the prime numbers in range 32 to 50

public class AddPrimeInRange {
    public static void main(String[] args){
        int sum=0;
        for(int i=32; i<=50; i++){
            boolean isPrime = true;
            for (int j=2; j<=i/2; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
