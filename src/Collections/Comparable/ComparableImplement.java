package Collections.Comparable;
import java.util.*;
public class ComparableImplement{
    public static void main(String[] args){
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(201, "John", 50000.0));
        emp.add(new Employee(103, "Emma", 75000.0));
        emp.add(new Employee(150, "Liam", 62000.0));
        emp.add(new Employee(120, "Olivia", 58000.0));

        System.out.println("Employees before sorting:");
        for(Employee e : emp){
            System.out.println(e);
        }

        Collections.sort(emp);
        System.out.println();
        System.out.println("Employees after sorting:");
        for(Employee e : emp){
            System.out.println(e);
        }

    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSal(){
        return salary;
    }
    public String toString(){
        return "ID: "+id+", Name: "+name+", Salary: "+salary;
    }
    public int compareTo(Employee e){
        return this.id - e.id;
    }
}

