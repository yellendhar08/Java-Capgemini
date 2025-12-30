package StaticLocalGlobal;
//WAJP to execute Instance initializer block and excute non static method before the execution of Main Method
public class ExecuteInstanceBeforeMain {
    {
        System.out.println("Instance Initializer block is executed");
        NonStaticMethod();
    }
    public void NonStaticMethod(){
        System.out.println("Non static method executed");
    }

    public static void main(String[] args) {
        ExecuteInstanceBeforeMain obj = new ExecuteInstanceBeforeMain();

    }
}
