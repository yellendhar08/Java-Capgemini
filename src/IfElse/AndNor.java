package IfElse;

public class AndNor {
    public static void main(String[] args){
        boolean a= true;
        boolean b = false;
        boolean c = a||b && !a;
        System.out.println(c);
    }
}
