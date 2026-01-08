package OOPs.Polymorphism;

public class MethodOverloading {
    public void show(){
        System.out.println("This is no argument method");
    }
    public void show(String name){
        System.out.println("This is String argument method");
    }
    public void show(int marks){
        System.out.println("This is int argument method");
    }
    public void show(String name, int marks){
        System.out.println("This is String and int argument method");
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.show();
        obj.show("Kiran");
        obj.show(97);
        obj.show("Manoj",90);
    }
}
