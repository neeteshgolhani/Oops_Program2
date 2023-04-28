package commercialdataprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Define the StockAccount class to manage customer accounts for a financial institution
public class StockAccounts {
    // List to store the CompanyShares objects for a specific customer account
    private List<CompanyShares> companySharesList;
    // Double to store the total value of the account in dollars
    private double accountValue;

    // Constructor to initialize the StockAccount object with data from a file
    public StockAccounts(String filename) throws IOException {
        // Initialize the companySharesList and accountValue
        this.companySharesList = new ArrayList<>();
        this.accountValue = 0.0;
        // Create a File object for the given filename
        File file = new File(filename);
        // If the file exists, read the data and add it to the companySharesList
        if (file.exists()) {
            // Create a BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            // Read each line of the file and create a CompanyShares object to add to the companySharesList
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                String symbol = tokens[0];
                int numShares = Integer.parseInt(tokens[1]);
                Date dateTime = new Date(Long.parseLong(tokens[2]));
                CompanyShares companyShares = new CompanyShares(symbol, numShares, dateTime);
                companySharesList.add(companyShares);
            }
            // Close the BufferedReader
            reader.close();
            // If the file doesn't exist, create a new file
        } else {
            file.createNewFile();
        }
    }

    // Method to calculate the total value of the account in dollars
    public double valueOf() {
        // Initialize the totalValue to the accountValue
        double totalValue = accountValue;
        // Loop through each CompanyShares object in the companySharesList
        for (CompanyShares companyShares : companySharesList) {
            // Get the price per share for the company symbol
            double pricePerShare = getPricePerShare(companyShares.getSymbol());
            // Add the value of the shares to the totalValue
            totalValue += pricePerShare * companyShares.getNumShares();
        }
        // Return the totalValue
        return totalValue;
    }

    private double getPricePerShare(String symbol) {

        return 0;
    }

    // Method to buy shares of a specific company
    public void buy(int amount, String symbol) throws Exception {
        // Get the price per share for the company symbol
        double pricePerShare = getPricePerShare(symbol);
        // Calculate the total price of the shares
        double totalPrice = pricePerShare * amount;
        // If the account doesn't have enough funds to buy the shares, throw an Exception
        if (totalPrice > accountValue) {
            throw new Exception("Insufficient funds to buy shares.");
        }
        // Loop through each CompanyShares
    }

    public void sell(int i, String aapl) {
    }

    public void save(String s) {
    }

    public void printReport() {
    }
}
