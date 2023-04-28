package accountmanagement;
/*The AccountTest class prompts the user for the initial account balance,
 and then enters a loop that prompts the user for debit amounts until the user enters 0 to exit.
 Each debit amount is passed to the debit method of the Account object, and the new account balance
 is printed after each transaction. If the user enters a debit amount that exceeds the account balance,
 the debit method will print a message indicating that the debit amount exceeded the account balance,
 and the account balance will not be changed.*/
public class Account {
    private double balance;
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void credit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Credit amount cannot be negative.");
        }
        balance += amount;
    }
    public void debit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Debit amount cannot be negative.");
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }
}
