package WhileLoop;

public class PrintChars {
    public static void main(String args[]){
        System.out.println("From A to M: ");
        char a ='A';
        while(a<='M'){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
        System.out.println("From x tp m: ");
        char b = 'x';
        while (b>='m'){
            System.out.print(b+" ");
            b--;
        }
    }
}
