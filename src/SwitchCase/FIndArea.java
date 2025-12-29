package SwitchCase;

import javax.swing.*;
import java.util.Scanner;
import java.util.SequencedSet;

public class FIndArea {
    public static void main(String args[]){
        System.out.println("Enter shape: ");
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        switch (shape){
            case "circle":
                double radius = sc.nextDouble();
                System.out.println("Area of Circle is: "+ 3.14 * (radius*radius));
                break;
            case "triangle":
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("area of Triangle is: "+(base*height)/2);
                break;
        }
    }
}
