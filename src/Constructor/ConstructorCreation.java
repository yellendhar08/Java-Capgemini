package Constructor;

public class ConstructorCreation {
    public ConstructorCreation(){
        System.out.println("Constructor is called");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        ConstructorCreation obj = new ConstructorCreation();
        System.out.println("MainEnd");
    }
}

