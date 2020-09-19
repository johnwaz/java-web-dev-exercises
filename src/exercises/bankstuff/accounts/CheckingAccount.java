package exercises.bankstuff.accounts;

import java.util.ArrayList;

public class CheckingAccount extends BankAccount{

    private double fee;
    private final double overdrawAmount = 5;

    public CheckingAccount(int accountNo, double fee) {
        super(accountNo); // calls parent constructor, sets two fields
        this.fee = fee;
    }

    public void collectFee() {
        this.balance -= this.fee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0 || amount > this.balance + this.overdrawAmount) {
            throw new IllegalArgumentException();
        }
        this.balance += amount;
    }

    public static void main(String[] args) {
        CheckingAccount johnsChecking = new CheckingAccount(1, 5);
        SavingsAccount johnsSavings = new SavingsAccount(2, 0.0001);
        johnsChecking.deposit(100);
        johnsSavings.deposit(100);

        BankAccount ba1 = (BankAccount)johnsChecking;
        BankAccount ba2 = (BankAccount)johnsSavings;

        ba1.deposit(100);
        //CheckingAccount jc1 = (ChecingAccount)ba1;
        //jc1.collectFee();
        System.out.println(ba1.getBalance());

        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(johnsChecking);
        accounts.add(johnsSavings);

        System.out.println(accounts);
    }
}
