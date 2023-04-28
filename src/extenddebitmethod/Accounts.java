package extenddebitmethod;
/*This code creates an Account object with an initial balance of $100,
and then attempts to withdraw $50 and $200 from the account using the new debit method.
The first withdrawal is successful and the balance is updated,
while the second withdrawal fails and a message is printed indicating
that the debit amount exceeded the account balance.*/
public class Accounts {
    private String accountName;
    private double balance;

    public Accounts(String johnSmith, double v) {

    }

    public void Account(String name, double initialBalance) {
        accountName = name;

        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public void credit(double amount) {
        balance += amount;
    }

    // new method to withdraw money from the account
    public boolean debit(double amount) {
        // check if the withdrawal amount exceeds the balance
        if (amount > balance) {
            // if so, print a message indicating the failure and return false
            System.out.println("Debit amount exceeded account balance.");
            return false;
        } else {
            // if not, subtract the amount from the balance and return true
            balance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }
}
