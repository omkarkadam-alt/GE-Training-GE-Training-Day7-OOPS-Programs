package stock_account_management;

import java.util.Scanner;

public class Stock {
    String name;
    int numberOfShares;
    double sharePrice;

    Stock(String name, int numberOfShares, double sharePrice)
    {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    double getStockValue(){
        return (numberOfShares * sharePrice);
    }

    static Stock getNewStock()
    {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Share Name: ");
        String shareName = scannerObject.nextLine();

        System.out.println("Enter Share Quantity: ");
        int numberOfShares = scannerObject.nextInt();

        System.out.println("Enter Share Value");
        double shareValue = scannerObject.nextDouble();
        
        Stock newStock = new Stock(shareName, numberOfShares, shareValue);

        return newStock;
    }
}
