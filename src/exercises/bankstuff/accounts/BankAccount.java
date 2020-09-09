package exercises.bankstuff.accounts;

public class BankAccount {

    private int accountNo;
    private double balance;

    public BankAccount(int accountNo) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
