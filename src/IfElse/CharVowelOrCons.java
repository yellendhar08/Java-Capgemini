package IfElse;

import java.util.Scanner;

public class CharVowelOrCons {
    public static  void main(String args[]){

        //WAJP to check if a given char is a Upper or lower case vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charcater: ");
        char c = sc.next().charAt(0);
        if(c>='A' && c<='Z'){
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.println("Character is UpperCase Vowel");
            }else{
                System.out.println("Character is UpperCase Consonant");
            }
        }else{
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.println("Character is LowerCase Vowel");
            }else{
                System.out.println("Character is LowerCase Consonant");
            }
        }
    }
}
