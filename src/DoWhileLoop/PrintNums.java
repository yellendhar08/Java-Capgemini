package DoWhileLoop;

public class PrintNums {
    public static void main(String args[]){
        int a =-111;
        do {
            System.out.print(a+" ");
            a++;
        }while (a<=-101);

        System.out.println();
        int b = 123;
        do{
            System.out.print(b+" ");
            b--;
        }while (b>=113);

        System.out.println();
        int c = 5;
        do{
            System.out.print(c+" ");
            c--;
        }while (c>=-5);

        System.out.println();
        int d = -10;
        do {
            System.out.print(d+" ");
            d++;
        }while (d<=0);
    }
}
