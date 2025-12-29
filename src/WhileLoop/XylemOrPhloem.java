package WhileLoop;
import java.util.Scanner;
public class XylemOrPhloem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int outer = n%10;
        int innersum=0;
        n=n/10;
        while (n>10){
            int digit = n%10;
            innersum+=digit;
            n=n/10;
        }
        outer+=n;
        if(innersum==outer) System.out.println("1");
        else System.out.println("0");
    }
}
