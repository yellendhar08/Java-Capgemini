package SwitchCase;
import java.util.Scanner;

public class WeekDayFind {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter day name: ");
            String day = sc.next().toLowerCase();

            if (day.equals("monday") || day.equals("tuesday") ||
                    day.equals("wednesday") || day.equals("thursday") ||
                    day.equals("friday")) {

                System.out.println("Weekday");

            } else if (day.equals("saturday") || day.equals("sunday")) {

                System.out.println("Weekend");

            } else {
                System.out.println("Invalid input");
            }
        }
    }

