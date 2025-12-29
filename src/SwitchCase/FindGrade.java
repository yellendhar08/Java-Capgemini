package SwitchCase;

import java.util.Scanner;

public class FindGrade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F' :
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter valid grade");
                break;
        }
        System.out.println();
    }
}

