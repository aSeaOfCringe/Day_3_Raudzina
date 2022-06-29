package day_3;

public class BankAccount {
    private double balance;
    BankAccount(){
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount<=5000) balance += amount;
        else System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
    }

    public void withdraw(double amount){
        if(balance>amount) balance -= amount;
        else System.out.println("There is not enough funds.");
    }

    public void printBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void transfer(BankAccount account1, double amount){
        if(account1.balance>amount){
            this.balance += amount;
            account1.balance -= amount;
        }
        else System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + account1.balance + " are available.");
    }

}
