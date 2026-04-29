public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative!");
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive!");
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive!");
        if (amount > balance)
            throw new IllegalStateException("Insufficient balance!");
        this.balance -= amount;
    }

    public double getBalance() {
         return balance; 
        }
    public String getOwner()   { 
        return owner; 
    }
}