package WhileLoop;

public class WhileLoopP1 {
    public static void main(String args[]) {
        int a = -123;
        System.out.println("-->numbers from range -123 to -129: ");

        //Print numbers from range of -123 to -129 using while loop
        while (a >= -129) {
            System.out.print(a+" ");
            a--;
        }
        System.out.println();
        System.out.println("-->numbers from range 79 to 84: ");

        //Print numbers from range 79 to 84
        int b = 79;
        while (b<=84){
            System.out.print(b+" ");
            b++;
        }
        System.out.println();

        System.out.println("-->numbers from range -110 to -100: ");

        //Print numbers from range -110 to -100
        int c = -110;
        while (c<=-100){
            System.out.print(c+" ");
            c++;
        }
        System.out.println();
        System.out.println("-->numbers from range 0 to -9: ");

        //Print numbers from range 0 to -9
        int d = 0;
        while (d>=-9){
            System.out.print(d+" ");
            d--;
        }
    }
}