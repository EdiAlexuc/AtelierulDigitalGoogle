package Concurrency.CodeChallenge2;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double initialBalance){
        this.name = name;
        this.balance = initialBalance;
    }

    public void  withdraw(double amount){
        longDatabaseCall();
        if(balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount){
        longDatabaseCall();
        balance += amount;
    }

    public void longDatabaseCall(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
