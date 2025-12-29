package ForLoops;

//WAJP to print numbers divisible by 7 in range 100-50
public class DivisibleBy7 {
    public static void main(String args[]){
        for(int i=100; i>=50; i--){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }

    }
}
