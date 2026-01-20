package LambdaFunction;

import java.util.List;

public class MethodReferene {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Emp(1, "Rohit", 75000.0),
                new Emp(2,"Hithesh", 94822.0),
                new Emp(3,"Nikhil", 85000.0));


        System.out.println("\nUsing Lambda Funtion: ");
        employees.forEach(name -> name.printDetails());
        System.out.println("\nUsing Method Reference: ");
        employees.forEach(Emp :: printDetails);

    }
}
class Emp{
    int id;
    String  name;
    double sal;
    public Emp(int id, String name, double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public  void printDetails(){
        System.out.println("Id: "+id+" Name: "+name+" Salary: "+sal);
    }
}