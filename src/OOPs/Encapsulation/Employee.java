package OOPs.Encapsulation;

class SetDetails{
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public void setEmployee_id(int employee_id){
        this.employee_id=employee_id;
    }
    public int getEmployee_id(){
        return employee_id;
    }
    public void setEmployee_name(String employee_name){
        this.employee_name = employee_name;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    SetDetails(double employee_salary){
        this.employee_salary=employee_salary;
    }
    public String getEmployee_salary(){
        return "$"+ employee_salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        SetDetails obj = new SetDetails(85000.0);
        obj.setEmployee_id(105);
        System.out.println("Employee ID: "+obj.getEmployee_id());

        obj.setEmployee_name("Suraj");
        System.out.println("Employee Name: "+obj.getEmployee_name());

        System.out.println("Salary: "+obj.getEmployee_salary());

    }
}
