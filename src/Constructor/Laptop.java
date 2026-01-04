package Constructor;

public class Laptop {
    String brand;
    int ramSize;
    double price;
    public Laptop(){
        this.brand = "Unknown";
        this.ramSize=8;
        this.price=50000.0;
    }
    public Laptop(String brand){
        this();
        this.brand=brand;
    }
    public Laptop(String brand, int ramSize){
        this(brand);
        this.ramSize=ramSize;
    }
    public Laptop(String brand, int ramSize, double price){
        this(brand,ramSize);
        this.price=price;
    }
    public void printDetails(){
        System.out.println("Brand: "+brand);
        System.out.println(("Ram Size: "+ramSize));
        System.out.println("Price "+price);
    }


    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        Laptop obj2 = new Laptop("Lenovo");
        Laptop obj3 = new Laptop("Hp",16);
        Laptop obj4 = new Laptop("Dell",8,54000.0);
        obj1.printDetails();
        System.out.println();
        obj2.printDetails();
        System.out.println();
        obj3.printDetails();
        System.out.println();
        obj4.printDetails();

    }
}
