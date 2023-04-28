package stockmanagement;
public class Stock {
    private String name;
    private int shares;
    private double price;

    // Constructor for the Stock class
    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    // Method to calculate the value of a stock
    public double getValue() {
        return shares * price;
    }

    // Getter method for the name of a stock
    public String getName() {
        return name;
    }

    // Getter method for the number of shares of a stock
    public int getShares() {
        return shares;
    }

    // Getter method for the price of a stock
    public double getPrice() {
        return price;
    }
}