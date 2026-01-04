package Constructor;


public class Employee {
    int id;
    Address address;
    public Employee(int id, Address address){
        this.id = id;
        this.address=address;
    }
    public Employee(Employee obj){
        this.id=obj.id;
        this.address=obj.address;
    }
    public static void main(String[] args) {
        Address add1 = new Address("Hyderabad");
        Employee ref1 = new Employee(10,add1);
        Employee ref2 = new Employee(ref1);


        ref2.address.city="Kochi";

        System.out.println(ref1.address.city);
        System.out.println(ref2.address.city);
    }
}

class Address{
    String city;
    public Address(String city){
        this.city=city;
    }
}