package Collections.ArrayList;

import java.util.ArrayList;

interface BankOperations{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
abstract class Account{
    private int accountNo;
    private String holderName;
    private double balance;

    public Account(int accountNo, String holderName, double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void setAccountNO(int accountNo){
        this.accountNo=accountNo;
    }
    public int getAccountNo(){
        return accountNo;
    }

    public void setHolderName(String holderName){
        this.holderName=holderName;
    }
    public String getHolderName(){
        return holderName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends Account implements BankOperations{

    public SavingsAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
    public void withdraw(double amount){
        setBalance(getBalance() + amount);
    }
    public void checkBalance(){
        System.out.println("Balance Available: "+getBalance());
    }
}

class CurrentAccount extends Account implements BankOperations{
    public CurrentAccount(int a, String n, double b){
        super(a,n,b);
    }
//    double balance = getBalance();
    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
    public void withdraw(double amount){
        setBalance(getBalance() -amount);
    }
    public void checkBalance(){
        System.out.println("Balance Available: "+getBalance());
    }

}
public class MainBanking {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "Rahul", 5000));
        accounts.add(new CurrentAccount(102, "Sunita", 10000));
        
    }
}
