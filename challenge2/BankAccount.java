package javaOOPELearning.challenge2;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    // Getters
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // specifics
    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

}
