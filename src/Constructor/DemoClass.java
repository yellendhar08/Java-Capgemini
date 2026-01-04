package Constructor;

public class DemoClass {
    static {
        System.out.println("This is SIB one");
    }
    static {
        System.out.println("This is SIb two");
    }
    {
        System.out.println("This is IIB");
    }
    public void displayMessage(){
        System.out.println("This is non-static method");
    }
    public static void staticMethodOne(){
        System.out.println("This is static method one");
    }
    public static void staticMethodTwo(){
        System.out.println("This is static method two");
    }

    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.displayMessage();
        staticMethodOne();
        staticMethodTwo();
    }
}
