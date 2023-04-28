package commercialdataprocessing;
import java.util.Date;
// Define the CompanyShares class to represent a share of a specific company
public class CompanyShares {
    private final String symbol;
    private final Date dateTime;
    private final int numShares;

    // Constructor to initialize the CompanyShares object with symbol, number of shares, and transaction datetime
    public CompanyShares(String symbol, int numShares, Date dateTime) {
        this.symbol = symbol;
        this.numShares = numShares;
        this.dateTime = dateTime;
    }

    // Getter method to return the symbol of the company
    public String getSymbol() {
        return symbol;
    }

    // Getter method to return the number of shares
    public int getNumShares() {
        return numShares;
    }

    // Getter method to return the transaction datetime
    public Date getDateTime() {
        return dateTime;
    }
}

