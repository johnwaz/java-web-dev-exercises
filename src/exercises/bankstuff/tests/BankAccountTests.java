package exercises.bankstuff.tests;

import exercises.bankstuff.accounts.BankAccount;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankAccountTests {
    // has-a's
    // accountNumber
    // balance
    // Owner(s) - Joint?

    // type - checking, savings, etc.


    // can-do's
    // deposit
    // withdraw
    // transfer
    // accrueInterest

    private BankAccount ba;

    @Before
    public void makeBankAccount() {
        ba = new BankAccount(10);
        ba.deposit(10);
    }

    @Test
    public void testSimpleDeposit() {
        ba.deposit(1);
        assertEquals(11, ba.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeValue() {
        ba.deposit(-2);
        fail("Should not be able to deposit a negative amount");
    }

//    @Test
//    public void testSimpleWithdrawal() {
//        ba.withdraw(5);
//        assertEquals(-5, ba.getBalance(), 0.001);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testDepositNegativeValue() {
//        ba.deposit(-2);
//        fail("Should not be able to withdraw a negative amount");
//    }

}
