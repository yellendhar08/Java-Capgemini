package OOPs.Encapsulation;

public class Person {
    private String name;
    private int age;
    private String country;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }

    public static void main(String[] args) {
    Person obj = new Person();
    obj.setName("Ram Charan");
    System.out.println("Name: "+obj.getName());

    obj.setAge(21);
    System.out.println("Age: "+obj.getAge());

    obj.setCountry("India");
    System.out.println("Country: "+obj.getCountry());
    }
}
