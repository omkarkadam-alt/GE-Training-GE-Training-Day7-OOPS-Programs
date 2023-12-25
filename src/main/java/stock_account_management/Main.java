package stock_account_management;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the number of stocks in the portfolio: ");
        int numberOfStocks = scannerObject.nextInt();

        StockPortfolio myStockPortfolio  = new StockPortfolio();

        for(int i = 0; i < numberOfStocks; i++)
        {
            Stock newStock = Stock.getNewStock();
            myStockPortfolio.addStock(newStock);;
        }

        myStockPortfolio.printStockReport();
        
        scannerObject.close();

    }
}