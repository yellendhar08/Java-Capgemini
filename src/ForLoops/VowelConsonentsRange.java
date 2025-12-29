package ForLoops;

import java.util.Scanner;
//
public class VowelConsonentsRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        //Uppercas vowel range 10 to 20 using do while
        if(Character.isUpperCase(ch) && ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U'){
            int range =10;
            do{
                System.out.print(range+" ");
                range++;
            }while (range<=20);
        //Lowercase Vowel range from -20 to -10
        } else if (Character.isLowerCase(ch) && ch=='a' || ch=='e' || ch=='i'||ch=='o' ||ch=='u') {
            int range2 =-10;
            while (range2>=-20){
                System.out.print(range2+" ");
                range2--;
            }
        } else if (Character.isUpperCase(ch)) {
            for (int i=25; i>=15; i--){
                System.out.print(i+" ");
            }
        } else if (Character.isLowerCase(ch)) {
            for(int i=-25; i<=-15; i++){
                System.out.print(i+" ");
            }
        }
    }
}
