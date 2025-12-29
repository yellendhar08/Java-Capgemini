package SwitchCase;

import java.util.Scanner;

public class ArthmeticOps {
    public static void main(String args[]){
        //WAJP to perform arithmatic operations using switch and user choice
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operation you want: ");
        String type = sc.nextLine().toLowerCase();
        switch(type){
            case "add" :
                System.out.println("Enter no of values you want to add: ");
                int size = sc.nextInt();
                int Maxsum=0;
                for(int i=0; i<size; i++){
                    int value = sc.nextInt();
                    Maxsum+=value;
                }
                System.out.println("Addition of all values are :"+Maxsum);
                break;
            case "sub":
                System.out.println("Enter no of values you want to subtract: ");
                int size2 = sc.nextInt();
                int MaxSub=0;
                for(int i=0; i<size2; i++){
                    int value2 = sc.nextInt();
                    MaxSub-=value2;
                }
                System.out.println("Subtraction of all values are :"+MaxSub);
                break;
            case "mul":
                System.out.println("Enter no of values you want to multiply: ");
                int size3 = sc.nextInt();
                int MaxMul = 1;
                for(int i=0; i<size3; i++){
                    int multi = sc.nextInt();
                    MaxMul=MaxMul*multi;
                }
                System.out.println("Multiplication of all values are: "+ MaxMul);
                break;
        }

    }
}
