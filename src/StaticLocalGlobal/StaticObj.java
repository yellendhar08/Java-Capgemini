package StaticLocalGlobal;

public class StaticObj {
    static int a =10;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticObj.a);
        StaticObj obj = new StaticObj();
        System.out.println(obj.a);
    }
}
