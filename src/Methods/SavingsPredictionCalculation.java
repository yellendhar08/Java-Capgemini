package Methods;

import java.util.Scanner;

public class SavingsPredictionCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = 45000;
        double expense = 30000;
        boolean festiveMonth = true;
        System.out.println("Savings of the non festive month: "+(predict(income,expense)));
        System.out.println("Festive expenses = " + (expense * 1.2));
        System.out.println("Savings of the festive month: "+(predict(income,expense,festiveMonth)));

    }
    public  static double predict(double income, double expense){
        return income-expense;
    }

    public static double predict(double income, double expense, boolean festivemonth){
        if(festivemonth){
            double fest = expense*1.2;
            return income-fest;
        }
        return income-expense;
    }
}
