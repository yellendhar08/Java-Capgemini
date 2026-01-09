package OOPs.Interface;

interface Father{
    abstract public void test();
    abstract public int add(int a, int b);
}
class Son implements Father{
    public void test(){
        System.out.println("This is son class abstract method override");
    }
    public int add(int a, int b){
        return a+b;
    }
}
public class InterfaceImplement {
    public static void main(String[] args) {
        Father f1 = new Son();
        f1.test();
        System.out.println(f1.add(10,20));
    }
}
