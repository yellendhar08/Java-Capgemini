package ExceptionHandling;

import java.util.Scanner;

class NotEligibleException extends Exception{
    public  NotEligibleException (String msg){
        System.out.println("msg = " + msg);
    }
}

public class CustomException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try{
            EligibleOrNot(age);
        }
        catch (NotEligibleException e){
            e.printStackTrace();
        }

    }
    public static void EligibleOrNot(int age) throws NotEligibleException{
        if(age>=18){
            System.out.println("you can eligible to vote");
        }
        else {
            throw new NotEligibleException("You are not eligible to vote");
        }
    }
}
