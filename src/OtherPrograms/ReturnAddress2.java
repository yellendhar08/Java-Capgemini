package OtherPrograms;

public class ReturnAddress2 {
    public static void main(String[] args) {
        ReturnAddress2 obj1 = new ReturnAddress2();
        System.out.println(returnAdd(obj1));

    }
    public static ReturnAddress2 returnAdd(ReturnAddress2 obj){
        return obj;
    }
}
