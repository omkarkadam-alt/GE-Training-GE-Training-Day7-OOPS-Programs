package stock_account_management;

import java.util.ArrayList;

public class StockPortfolio {
    
    ArrayList<Stock> stockList;

    StockPortfolio(){
        stockList = new ArrayList<Stock>();
    }

    void addStock(Stock stock){
        stockList.add(stock);
    }

    double getPortfolioValue(){
        double totalValue = 0.0;
        
        for(Stock currStock: stockList){
            totalValue += currStock.getStockValue();
        }

        return totalValue;
    }

    void printStockReport(){

        if(stockList.isEmpty()){
            System.out.println("No stocks in the portfolio.");
            return;
        }
        System.out.println("----------------------------");
        System.out.println();

        System.out.printf("%-20s %-20s %-20s %-20s %n", "Stock name ", " Stock Qty" , "Stock Price " , "Stock Value ");

        for(Stock currStock: stockList){
            System.out.printf("%-20s %-20d %-20.4f %-20.4f %n", currStock.name, currStock.numberOfShares, currStock.sharePrice, currStock.getStockValue());
        }

        System.out.println();
        System.out.println("Total Stock Value: " + getPortfolioValue());
        System.out.println("----------------------------");
        System.out.println();
    }

}
