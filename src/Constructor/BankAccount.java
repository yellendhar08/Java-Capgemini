package Constructor;

public class BankAccount {
    static double interestRate =0.05;
    double balance =1000;

    public  static void updateInterestRate(double newRate){
       interestRate=newRate;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else {
            System.out.println("Insufficient Funds!");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Available Balance: $"+balance);
        System.out.printf("Interest Rate: %.2f%%",(interestRate*100),"%%");
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2=new BankAccount();

        acc1.deposit(5000);
        acc1.withdraw(3100);

        acc2.deposit(2500);
        acc2.withdraw(1800);
        updateInterestRate(0.07);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();


    }
}
