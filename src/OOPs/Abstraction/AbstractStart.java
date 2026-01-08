package OOPs.Abstraction;

public class AbstractStart {
    public static void main(String[] args) {
        Father obj1 = new Son(); //Up Casting
        obj1.test();
        System.out.println(obj1.add(10,15));
        Son obj2 = (Son) obj1; //down casting
        obj2.okay();
    }
}
abstract class Father{
    abstract public void test();
    abstract public int add(int a, int b);
}
class Son extends Father{
    @Override
    public void test(){
        System.out.println("Test method overrided");
    }
    @Override
    public int add(int a, int b) {
        return a+b;
    }
    public void okay(){
        System.out.println("Ok");
    }
}

