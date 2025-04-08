package code.vanilson.oop;

/**
 * Account
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */

public class Account {
    private int balance;
    private Client client;

    public Account(Client client) {
        this.balance = 0;
        this.client = client;
    }

    public synchronized void deposit(int amount) {
        verifyIfAmountIsNegativeOrZero(amount);
        this.balance += amount;
    }

    public synchronized void withdraw(int amount) {
        verifyIfAmountIsNegativeOrZero(amount);

        if (getBalance() < amount) {
            throw new WithdrawIllegalOperationException("Withdraw Illegal operation");
        }
        this.balance -= amount;
    }

    private static void verifyIfAmountIsNegativeOrZero(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }
    }

    public synchronized int getBalance() {
        return this.balance;
    }

    public void addClient(Client client) {
        this.client = client;
    }

}