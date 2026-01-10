package ObjectClass;

public class EqualsMethod {
    int id;
    String name;

    public EqualsMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        EqualsMethod ref = (EqualsMethod) obj;
        return this.id == ref.id && this.name == ref.name;
    }
    public static void main(String[] args) {
        EqualsMethod ref1 = new EqualsMethod(1,"Mohit");
        EqualsMethod ref2 = new EqualsMethod(1,"Mohit");

        System.out.println("ref1: "+ ref1);
        System.out.println("ref2: "+ ref2);
        System.out.println(ref1.equals(ref2)); // true

    }
}
