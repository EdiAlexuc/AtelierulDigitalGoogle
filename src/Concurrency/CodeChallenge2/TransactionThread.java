package Concurrency.CodeChallenge2;

public class TransactionThread extends Thread{
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    public TransactionThread(String name, BankAccount fromAccount, BankAccount toAccount, double amount){
        super(name);
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void run(){
        transfer(fromAccount, toAccount, amount);
    }

    private void transfer(BankAccount from, BankAccount to, double amount){
        from.withdraw(amount);
        to.deposit(amount);
    }
}


