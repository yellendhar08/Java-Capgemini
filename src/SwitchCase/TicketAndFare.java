package SwitchCase;

import java.util.Scanner;

public class TicketAndFare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Passenger ID: ");
        int passID = sc.nextInt();

        System.out.print("Enter Passenger Name: ");
        String  passName = sc.nextLine();
        sc.nextLine();

        System.out.print("Enter Passenger Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Travel Type (1-Bus, 2-train, 3-Fight): ");
        int travelType = sc.nextInt();

        System.out.print("Enter Base Fare: ");
        double baseFare = sc.nextDouble();

        System.out.print("Passenger is a Govt emp (true/false): ");
        boolean isGovtEmp = sc.nextBoolean();

        double finalFare = 0.00;
        String classText= "";
        double discountedPrice =0.00;
        String bookingStatus ="";


        if(age<5){
            System.out.println("No Booking Required");
            return;
        }else if(age>80){
            System.out.println("Medical Clearance Required");
        }
        switch (travelType){
            case 1:
                System.out.print("Enter class(1-Sleeper, 2-Seater)");
                int  classType = sc.nextInt();
                switch (classType){
                    case 1:
                        classText="Sleeper";
                        finalFare = baseFare*1.2;
                        break;
                    case 2:
                        classText="Seater";
                        finalFare = baseFare*1.0;
                }
                break;
            case 2:
                System.out.print("Enter class(1-General, 2-Sleeper, 3-AC)");
                int  classType2 = sc.nextInt();
                switch (classType2){
                    case 1:
                        classText="General";
                        finalFare = baseFare*1.2;
                        break;
                    case 2:
                        classText="Sleeper";
                        finalFare = baseFare*1.3;
                        break;
                    case 3:
                        classText="AC";
                        finalFare=baseFare*1.6;
                        break;
                }
                break;
            case 3:
                System.out.print("Enter class(1-Economy, 2-Business)");
                int  classType3 = sc.nextInt();
                switch (classType3){
                    case 1:
                        classText="Economy";
                        finalFare = baseFare*2.5;
                        break;
                    case 2:
                        classText="Business";
                        finalFare = baseFare*3.5;
                        break;
                }
                break;
        }
        int discount=0;
        if(age>=60){
            discountedPrice = finalFare-(0.3*finalFare);
            discount=30;
        } else if (age>5 && age<12) {
            discountedPrice=finalFare-(0.5*finalFare);
            discount=50;
        }else if(isGovtEmp){
            discountedPrice=finalFare-(0.15*finalFare);
            discount=15;
        }else {
            discountedPrice=finalFare;
            discount=0;
        }


        if(discountedPrice>=10000){
            if(travelType==3){
                bookingStatus="Confirmed";
            }else {
                bookingStatus="Waiting List";
            }
        }else {
            bookingStatus="Confirmed";
        }
        System.out.println();
        System.out.println("---Booking Details---");
        System.out.println("Passanger ID: "+passID);
        System.out.println("Passanger Name: "+passName);
        System.out.println("Travel Type: "+travelType);
        System.out.println("Class Type: "+classText);
        System.out.println("Base Fare: "+baseFare);
        System.out.println("Discount Applied: "+discount+" %");
        System.out.println("Price After Discount: "+discountedPrice);
        System.out.println("Booking Status: "+bookingStatus);
    }
}
