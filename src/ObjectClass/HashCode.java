package ObjectClass;

public class HashCode {
    int id;
    String  name;
    public  HashCode(int id, String name){
        this.id = id;
        this.name=name;
    }
    public static void main(String[] args) {
        HashCode obj = new HashCode(10,"Nikhil");

        System.out.println(obj.hashCode());
        System.out.println(Integer.toHexString(obj.hashCode()));
        System.out.println(obj);

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
    }
}
