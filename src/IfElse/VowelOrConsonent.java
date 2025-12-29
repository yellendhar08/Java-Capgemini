package IfElse;

import java.util.Scanner;
public class VowelOrConsonent {
    public static void main(String args[]){
        //wajp to check whether the given character is vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Given char is a vowel");
        } else {
            System.out.println("Given char is a consonent");
        }
    }
}
