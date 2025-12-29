package SwitchCase;

import java.util.Scanner;
//WAJP to displau an employees designation based on the departmet ad role selected by user
public class DeptRole {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String dept = sc.nextLine();
        switch (dept){
            case "IT" :
                String role1 = sc.nextLine();
                switch (role1){
                    case "Developer":
                        System.out.println("You are an " +role1+ " working in " +dept+ " department");
                        break;
                    case "Tester":
                        System.out.println("You are an " +role1+ " working in " +dept+ " department");
                        break;
                    case "DevOps Engineer":
                        System.out.println("You are an  "+ role1+ " working in " +dept+ " department");
                        break;
                    default:
                        System.out.println("Enter valid role");
                }
            case "HR" :
                String role2 = sc.nextLine();
                switch (role2){
                    case "Recruiter":
                        System.out.println("You are an " +role2+ " working in " +dept+ " department");
                        break;
                    case "HR executive":
                        System.out.println("You are an " +role2+ " working in " +dept+ " department");
                        break;
                    case "Payroll Officer":
                        System.out.println("You are an " +role2+ " working in " +dept+ " department");
                        break;
                    default:
                        System.out.println("Enter valid role");
                }
            case "Finance" :
                String role3 = sc.nextLine();
                switch (role3){
                    case "Accountant":
                        System.out.println("You are an " +role3+ " working in " +dept+ " department");
                        break;
                    case "Financial Analyst":
                        System.out.println("You are an " +role3+ " working in " +dept+ " department");
                        break;
                    case "Auditor":
                        System.out.println("You are an " +role3+ " working in " +dept+ " department");
                        break;
                    default:
                        System.out.println("Enter valid role");
                }
            case "Operations" :
                String role4 = sc.nextLine();
                switch (role4){
                    case "Operation Executive":
                        System.out.println("You are an " +role4+ " working in " +dept+ " department");
                        break;
                    case "Team Lead":
                        System.out.println("You are an " +role4+ " working in " +dept+ " department");
                        break;
                    case "Manager":
                        System.out.println("You are an " +role4+ " working in " +dept+ " department");
                        break;
                    default:
                        System.out.println("Enter valid role");
                }
        }

    }
}
