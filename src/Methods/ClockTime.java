package Methods;

import java.util.Scanner;

/*Write a Java method clockProblem(int input1, int input2) that simulates a 12-hour analog clock.Problem Requirements
	input1 represents the current hour position on a clock (1–12).
	input2 represents the number of jumps/multiplication factor.
	Multiply input1 and input2 to calculate the movement.
	The clock should always stay within 1 to 12.
	If the calculated value exceeds 12, it should wrap around using clock logic.
	If the final calculated position becomes 0, it must be treated as 12.
*/
public class ClockTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1= sc.nextInt();
        int input2 = sc.nextInt();
        int result = ClockProblem(input1, input2);
        System.out.println(result);
    }
    public static int ClockProblem(int input1, int input2){
        int movement = input1*input2;
        int pos = movement%12;
        if(pos==0) {
            pos = 12;
        }
        return pos;
    }
}
