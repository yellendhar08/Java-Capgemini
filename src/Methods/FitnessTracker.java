package Methods;

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int user = sc.nextInt();
        int steps = inputSteps();
        System.out.print("Enter Weight: ");
        double weight = sc.nextDouble();
        double caloriesWithSteps = calculateCalories(steps);
//        System.out.printf("Caloreis burned based on Steps: %.2f ",caloriesWithSteps);
        double calsWithStepsAndBW =calculateCalories(steps, weight);
//        System.out.printf("Calories burned based on Steps and Weight %.2f ",calsWithStepsAndBW);
        showSummary(user,steps, weight, caloriesWithSteps, calsWithStepsAndBW);

    }
    public static int inputSteps(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Steps: ");
        int steps = sc.nextInt();
        return steps;
    }
    public static double calculateCalories(int steps){
        double calories= steps*0.04;
        return calories;
    }
    public static double calculateCalories(int steps, double weight){
        double calories = (steps * 0.04 )+ steps*(weight*0.0001);
        return calories;
    }
    public static void showSummary(int user, int steps, double weight, double caloriesWithSteps, double calsWithStepsAndBW){
        System.out.println("----Summary----");
        System.out.println("User ID: "+ user);
        System.out.println("Step Count: "+steps);
        System.out.println("Weight: "+weight);
        System.out.printf("Calories burned based on steps only: %.2f",caloriesWithSteps);
        System.out.println();
        System.out.printf("Calories burned based on steps and weight: %.2f ",calsWithStepsAndBW);


    }


}
