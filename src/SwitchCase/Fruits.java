package SwitchCase;

import java.util.Scanner;

public class Fruits {
    public static void main(String args[]){
        System.out.print("Enter a fruit: ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch (fruit) {
            case "apple": System.out.println("Apples are rich in fibre and vitamin C.");
            break;
            case "banana" : System.out.println("Bananas are a great source of potassium");
            break;
            case "mango" : System.out.println("Mangoes are the king of fruits");
            break;
            case "oranges" : System.out.println("Oranges are packed with vitamin C.");
            break;
            default : System.out.println("Sorry, I don't have information about that fruit.");
            break;
        }
    }
}
