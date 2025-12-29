package SwitchCase;

import java.util.Scanner;


public class EmpSalaryRole {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int EmployeeID = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        sc.nextLine();
        String EmployeeName = sc.nextLine();

        System.out.print("Enter Age: ");
        int Age = sc.nextInt();

        System.out.print("Enter Department(1=IT, 2=HR, 3=Finance): ");
        int Dept = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double BasicSalary = sc.nextDouble();

        String role="";
        String access ="";
        double FinalSalary=0.00;

        if(Age>21){
            switch (Dept){
                case 1:
                    System.out.print("Enter your role(Developer/Tester): ");
                    String role1 = sc.next().toLowerCase();
                    switch (role1) {
                        case "developer":
                            role = role1;
                            FinalSalary = BasicSalary + ((BasicSalary * 30) / 100);
                            break;

                        case "tester":
                            role = role1;
                            FinalSalary = BasicSalary + ((BasicSalary * 25) / 100);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Enter your role(Recruiter/Payroll): ");
                    String role2 = sc.next().toLowerCase();
                    switch (role2){
                        case "recruiter":
                            role = role2;
                            FinalSalary = BasicSalary+((BasicSalary*20)/100);

                            break;
                        case "payroll":
                            role=role2;
                            FinalSalary = BasicSalary+((BasicSalary*22)/100);
                            break;
                    }
                case 3:
                    System.out.println("Enter your role(Accountant/Auditor): ");
                    String role3 = sc.next().toLowerCase();
                    switch (role3) {
                        case "accountant":
                            role=role3;
                            FinalSalary = BasicSalary + ((BasicSalary * 28) / 100);
                            break;
                        case "auditor":
                            role=role3;
                            FinalSalary = BasicSalary + ((BasicSalary * 26) / 100);
                            break;
                    }
                    break;
            }

            //Setting up access level for the Departments
            if(BasicSalary>=60000 && Dept==1){
                access="Admin Access";
            } else if (BasicSalary>=60000 && Dept!=1) {
                access="Manager Access";
            }else {
                access="Employee Access";
            }

            //displaying all the details
            System.out.println("---Details of the employee---");
            System.out.println("Employee ID: "+EmployeeID);
            System.out.println("Employee Name: "+EmployeeName);
            System.out.print("Department : ");
            if(Dept==1) {
                System.out.println("IT");
                System.out.println("Role: "+role);
            }
            else if (Dept==2) {
                System.out.println("HR");
                System.out.println("Role: "+role);
            }else{
                System.out.println("Finance");
                System.out.println("Role :"+role);
            }
            System.out.println("Basic Salary: "+BasicSalary);
            System.out.println("Final Salary: "+FinalSalary);
            System.out.println("Access Level: "+ access);
        }else{
            System.out.println("Sorry, Employee is not eligible for this company");
            return;
        }
    }
}
