package accountmanagement;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create a Scanner object to read input from the user
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        // read the initial balance from the user
        Account account = new Account(initialBalance);
        // create a new Account object with the initial balance

        while (true) {
            System.out.print("Enter debit amount (or 0 to exit): ");
            double debitAmount = scanner.nextDouble();
            // read the debit amount from the user
            if (debitAmount == 0) { // check if the user wants to exit
                break; // exit the loop if the user wants to exit
            }
            account.debit(debitAmount); // debit the account with the specified amount
            System.out.println("New balance: " + account.getBalance());
            // print the new account balance
        }
    }
}