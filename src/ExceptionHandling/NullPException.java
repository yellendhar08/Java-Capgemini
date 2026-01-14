package ExceptionHandling;
class  Okok{
    int id;
}
public class NullPException {
    public static void main(String[] args) {
        Okok ok = null;
        try {
            System.out.println(ok.id);
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception handled");
        }

    }
}
