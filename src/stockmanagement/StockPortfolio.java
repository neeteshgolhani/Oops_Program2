package stockmanagement;

class StockPortfolio {
    private Stock[] stocks;

    // Constructor for the StockPortfolio class
    public StockPortfolio(int numStocks) {
        stocks = new Stock[numStocks];
    }

    // Method to add a stock to the portfolio
    public void addStock(int index, String name, int shares, double price) {
        stocks[index] = new Stock(name, shares, price);
    }

    // Method to calculate the total value of the portfolio
    public double getTotalValue() {
        double totalValue = 0.0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    // Method to print the stock report
    public void printReport() {
        System.out.println("Stock Report:");
        System.out.println("Name\tShares\tPrice\tValue");
        for (Stock stock : stocks) {
            System.out.printf("%s\t%d\t%.2f\t%.2f\n", stock.getName(), stock.getShares(), stock.getPrice(), stock.getValue());
        }
        System.out.printf("Total Value: %.2f\n", getTotalValue());
    }
}