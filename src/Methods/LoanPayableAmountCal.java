package Methods;

import java.lang.classfile.instruction.SwitchCase;

public class LoanPayableAmountCal {
    public static void main(String[] args) {
        double  principle = 200000;
        int years = 5;
        String loanType = "HOME";
        System.out.println("Simple Interest of Principle "+ principle +" is "+(loan(principle)));
        System.out.println("Compound Interest of Principle "+ principle +" for "+years+" years is "+ (loan(principle,years)));
        System.out.println("Compound Interest of Principle "+ principle +" for "+years+" years with loan type "+loanType+" is "+ (loan(principle,years,loanType)));
//        System.out.printf("Amount =: %.2f",(loan(principle,years,loanType)));

    }
    public static double loan(double principle){
        return principle*1.08;
    }
    public static double loan(double principle, int years){
        double amount = principle* Math.pow(1.10,  years);
        return amount;
    }
    public static double loan(double principle, int years, String loanType){
        double amount = 0.00;
        switch (loanType){
            case "HOME":
                amount = principle * Math.pow(1.07, years);
                break;
            case "AUTO":
                amount = principle * Math.pow(1.09, years);
                break;
            case "PERSONAL":
                amount = principle * Math.pow(1.12, years);
                break;
        }
        return amount;
    }
}
