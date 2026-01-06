package OOPs.ISaRelation;

class Father{
    int a=10;
    public void test(){
        System.out.println("Father non static method");
    }
    static {
        System.out.println("Father IIB");
    }
    public Father(){
        System.out.println("father constructor");
    }
}
class Son extends Father{
    private int b=20;
    public  void demo(){
        System.out.println("Son non Static method");
    }
    {
        System.out.println("Son IIB");
    }
    public Son(){
        System.out.println("Son constructor");
    }
}

public class Inheritance {
     {
        System.out.println("Main driven static block");
    }
    public static void main(String[] args) {
        System.out.println("Main start");
        Son son = new Son();
        son.test();
        son.demo();
        System.out.println("Main end");
    }
}
