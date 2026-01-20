package LambdaFunction;

interface Factorial{
    int findFactorial(int a);
}

public class FactorialUsingLambda {
    public static void main(String[] args) {
        Factorial ref1 = new Factorial() {
            public int findFactorial(int a){
                int product=1;
                for(int i=1; i<=a; i++){
                    product*=i;
                }
                return product;
            }
        };
        System.out.println("Factorial :"+ref1.findFactorial(5));

        Factorial ref2 = (a) -> {
            int fact =1;
            for(int i=1; i<=a; i++){
                fact*=i;
            }
            return fact;
        };
        System.out.println("Factorial using lambda: "+ref2.findFactorial(5));
    }
}
