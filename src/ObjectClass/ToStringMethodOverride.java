package ObjectClass;

public class ToStringMethodOverride {
    int id;
    String name;
    public ToStringMethodOverride(int id, String name){
        this.id = id;
        this.name=name;
    }

    public  String toString(){
        return "Id: "+id+", Name: "+name;
    }
    public static void main(String[] args) {
        ToStringMethodOverride obj = new ToStringMethodOverride(1, "Mohit");
        System.out.println(obj.toString());
    }
}
