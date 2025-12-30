package StaticLocalGlobal;

class P3{
    //int a=10;
    static int a = 20;
    public void test(){
        System.out.println("test start");
        System.out.println("Directly: "+a);
        System.out.println("With the help of ClassName: "+P3.a);
        System.out.println("With the help of this: "+this.a);


        System.out.println("test end");
    }
    public static void main(String[] args){
        System.out.println("main start");
        P3 ref = new P3();
        ref.test();
        System.out.println("main end");
    }
}
