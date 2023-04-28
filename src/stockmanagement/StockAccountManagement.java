package stockmanagement;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of stocks
        System.out.print("Enter the number of stocks: ");
        int numStocks = sc.nextInt();

        // Create a new StockPortfolio object with the specified number of stocks
        StockPortfolio portfolio = new StockPortfolio(numStocks);

        // Loop through each stock and prompt the user to enter its details
        for (int i = 0; i < numStocks; i++) {
            System.out.printf("Stock %d:\n", i + 1);
            System.out.print("Enter the stock name: ");
            String name = sc.next();
            System.out.print("Enter the number of shares: ");
            int shares = sc.nextInt();
            System.out.print("Enter the share price: ");
            double price = sc.nextDouble();
            portfolio.addStock(i, name, shares, price);
        }

        // Print the stock report
        portfolio.printReport();
    }
}