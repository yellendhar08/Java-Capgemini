package LambdaFunction;
interface FI1{
    void greet();
}
interface FI2{
    int add(int a, int b);
}

public class LambdaFunc {
    public static void main(String[] args) {
        FI1 ref1 = new FI1() {
            public void greet(){
                System.out.println("Hello from greet");
            }
        };
        ref1.greet();

        FI1 ref2 = () -> System.out.println("This is lambda of FI1");
        ref2.greet();

        FI2 obj1 = new FI2() {
            public  int add(int a, int b){
                return a+b;
            }
        };
        System.out.println("Using FI2 anonymous class: "+obj1.add(10,5));

        FI2 obj2 = (a,b) -> (a+b);

        System.out.println("Using Lambda function: "+obj2.add(20,30));


    }
}
