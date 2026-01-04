package Constructor;

public class OverloadingExample {
    public static void display(int number){
        System.out.println("this is static method with integer parameter");
    }
    public static void display(String letter){
        System.out.println("this is static method with String parameter");
    }
    public void display(int num, double num2){
        System.out.println("this is non static method with int and double parameters");
    }
    public void display(){
        System.out.println("this is non static method no parameters");
    }

    public static void main(String[] args) {
        display(9);
        display("okok");
        OverloadingExample obj = new OverloadingExample();
        obj.display(12,90.1);
        obj.display();
    }
}
