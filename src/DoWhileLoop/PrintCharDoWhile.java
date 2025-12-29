package DoWhileLoop;

public class PrintCharDoWhile {
    public  static  void main(String args[]){
        char ch = 's';
        do {
            System.out.print(ch+" ");
            ch--;
        }while (ch>='l');
        System.out.println();

        char ch2= 'T';
        do {
            System.out.print(ch2+" ");
            ch2++;
        }while (ch2<='Z');

    }
}
