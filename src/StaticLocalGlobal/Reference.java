package StaticLocalGlobal;

public class Reference {
    static String username;
    public static void main(String[] args) {
        Reference obj1 = new Reference();
        obj1.username = "Jeevan";

        Reference obj2 = new Reference();
        obj2.username = "Ganesh";

        Reference obj3 = new Reference();
        obj3.username = "Munny";

        System.out.println("Username 1: "+obj1.username);
        System.out.println("Username 2: "+obj2.username);
        System.out.println("Username 3: "+obj3.username);

    }
}
