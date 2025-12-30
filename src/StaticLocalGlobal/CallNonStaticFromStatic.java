package StaticLocalGlobal;
//Calling non-static method using static block

public class CallNonStaticFromStatic {
    static {
        System.out.println("Static block executed");
        CallNonStaticFromStatic obj = new CallNonStaticFromStatic();
        obj.NonStatic();
    }

    public void NonStatic(){
        System.out.println("Non Static method is executed");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println("Main End");
    }
}
