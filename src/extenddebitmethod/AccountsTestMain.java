package extenddebitmethod;

public class AccountsTestMain {
    public static void main(String[] args) {
        // create a new account with an initial balance of $100
        Accounts account1 = new Accounts("John Smith", 100.0);

        // print the account name and balance
        System.out.printf("%s balance: $%.2f%n", account1.getAccountName(), account1.getBalance());

        // attempt to withdraw $50 from the account using the new debit method
        boolean successfulWithdrawal = account1.debit(50.0);

        // check if the withdrawal was successful
        if (successfulWithdrawal) {
            // if so, print a success message
            System.out.printf("Successfully withdrew $%.2f from %s%n", 50.0, account1.getAccountName());
        } else {
            // if not, print a failure message
            System.out.printf("Failed to withdraw $%.2f from %s%n", 50.0, account1.getAccountName());
        }

        // print the updated account balance
        System.out.printf("%s balance: $%.2f%n", account1.getAccountName(), account1.getBalance());

        // attempt to withdraw $200 from the account using the new debit method
        boolean unsuccessfulWithdrawal = account1.debit(200.0);

        // check if the withdrawal was successful
        if (unsuccessfulWithdrawal) {
            // if so, print a success message
            System.out.printf("Successfully withdrew $%.2f from %s%n", 200.0, account1.getAccountName());
        } else {
            // if not, print a failure message
            System.out.printf("Failed to withdraw $%.2f from %s%n", 200.0, account1.getAccountName());
        }

        // print the updated account balance
        System.out.printf("%s balance: $%.2f%n", account1.getAccountName(), account1.getBalance());
    }
}

