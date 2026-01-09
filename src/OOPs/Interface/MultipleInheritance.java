package OOPs.Interface;

interface Father2{
    static int a=10;
    public static void test(){
        System.out.println("Father class static method");
    }
    abstract public void demo();
}
interface Son2{
    public static void okay(){
        System.out.println("Son class static method");
    }
    abstract public void notOkay();
}
class Daughter implements Father2, Son2{
    public void demo(){
        System.out.println("Father class overriden method");
    }
    public void notOkay(){
        System.out.println("Son class overriden method");
    }
    public void dinner(){
        System.out.println("Dinner done");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Father2 f1 = new Daughter();
        f1.demo();
        Son2 s1 = new Daughter();
        s1.notOkay();
        Father2.test();
        Son2.okay();
    }
}
