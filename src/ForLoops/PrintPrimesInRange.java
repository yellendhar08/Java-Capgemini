package ForLoops;

import java.util.Scanner;
//WAJP to print prime numbers from the range 20 to 1
public class PrintPrimesInRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 20;
        for(int i=n; i>=1; i--) {
            if (i<2) continue;
            boolean prime = true;
            for (int k = 2; k <= i / 2; k++) {
                if (i % k == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(i+" ");
        }
    }
}
