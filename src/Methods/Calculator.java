package Methods;
//WAJP to create calculator class consist of four methods, to add 3 variables, second to multiply 3 variables, to substract 4 variables, and to add 2 strings
public class Calculator {
    public static void main(String[] args){
        int a=10;
        int b=12;
        int c=2;
        int d =16;
        System.out.println(Add(a,b,c));
        System.out.println(Mul(a,b,c));
        System.out.println(Sub(a,b,c,d));
        System.out.println(AddString("hello","world!"));
    }
    public static int Add(int a, int b, int c){
        return (a+b+c);
    }
    public static int Mul(int a, int b, int c){
        return (a*b*c);
    }
    public static int Sub(int a, int b, int c, int d){
        return (a-b-c-d);
    }
    public static String AddString(String a, String b){
        return(a+b);
    }

}
