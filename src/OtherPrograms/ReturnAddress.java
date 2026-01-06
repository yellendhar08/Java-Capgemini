package OtherPrograms;

public class ReturnAddress {
    public static ReturnAddress returnAdd(){
        ReturnAddress obj = new ReturnAddress();
        return obj;
    }
    public static void main(String[] args) {
        System.out.println(returnAdd());
    }
}
