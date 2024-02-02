package javaOOPELearning.challenge2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("James", 100.0);

        System.out.println("Welcome!");
        System.out.println("The account belonging to: " + account.getOwner() + ", has a balance of: $" + account.getBalance());
        System.out.println("Let's withdraw $20...");

        account.withdraw(20.0);

        System.out.println("The balance is now: $" + account.getBalance());

        System.out.println("Thanks for banking with us.");
    }
}
