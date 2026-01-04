package Constructor;

public class Mobile {
    String brand;
    int storage;
    boolean is5G;

    public Mobile(){
        this.brand = "Unknown";
        this.storage=64;
        this.is5G=false;
    }
    public Mobile(String brand, int storage, Boolean is5G) {
        this();
        this.brand = brand;
        this.storage = storage;
        this.is5G = is5G;
    }
    public static void main(String[] args) {
        Mobile obj = new Mobile("Samsung",128, true);
        System.out.println(obj.brand);
        System.out.println(obj.storage);
        System.out.println(obj.is5G);
    }
}
