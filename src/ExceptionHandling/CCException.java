package ExceptionHandling;
//WAJP to handle class cast exception

class Father{

}
class Son extends  Father{

}
public class CCException {
    public  static void main(String[] args) {
        Father f1 = new Father();
        try {
            Son son = (Son) f1;
            System.out.println("Casted");
            }
        catch (ClassCastException e){
            System.out.println("ClassCastException handled");
            System.out.println("Reasen: "+e.getMessage());
        }
        System.out.println("Programme continues");
    }
}
