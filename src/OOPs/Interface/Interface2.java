package OOPs.Interface;

interface Father3 {
    static int a = 10;// final static int a = 10
    int b = 20; //  final static int b = 20

    public static void test() {
        System.out.println("static method");
    }
    void abs();

}
class Son3 implements Father3 {
    @Override
    public void abs() {
        System.out.println("abstract method");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        System.out.println("Main start");
//		Father ref = new Father(); CTE Cannot instantiate the type Father
        Father3 ref = new Son3();
        ref.abs();
        System.out.println(Father3.a);
        System.out.println(Father3.b);

//		ref.test(); CTE This static method of interface Father can only be accessed as Father.test
        Father3.test();
    }
}