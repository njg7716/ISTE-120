import java.util.Scanner;
/*
Course: ISTE-120
Author: Jim Leone, Rayno Niemi
Day 21 Decisions
Topic: Lab 07 Ex 1
*/
public class TradeStock  {
	public static void main(String[] args)	{
		//declarations
		Scanner in = new Scanner(System.in);
		String name;	//Name of stock
		String symbol;	//Symbol of stock
		double price;	//price per share of stock
		int    shares;	//number of shares of stock
		Stock myStock = new Stock();
		//Get name and symbol
		System.out.print("Enter name of stock: ");
		name = in.nextLine( );
      myStock.setName(name);
		System.out.print("Enter symbol of stock: ");
		symbol = in.nextLine( );
      myStock.setSymbol(symbol);
		
		//Instantiat Stock object with price and symbol
		
		//prompt user for price and set it
		System.out.print("Enter price of stock: ");
		price = in.nextDouble( );
		myStock.setPrice(price);
		
		//prompt user for number of shares and set it
		System.out.print("Enter number of shares: ");
		shares = in.nextInt();
		myStock.setShares(shares);
		
		//print  stock info using spaces with each output
		System.out.printf("%nName:   %s%n" ,myStock.getName());
		System.out.printf("Symbol: %s%n"  , myStock.getSymbol());
		System.out.printf("Price:  %.2f%n", myStock.getPrice());
		System.out.printf("Shares: %d%n"  , myStock.getShares());
      
      while (true){
         Scanner s = new Scanner(System.in);
         System.out.printf("\nOptions as a single upper or lower case character:\n");
         System.out.printf("\tB to buy the stock\n\tS to sell the stock\n\tAny other to exit\n");
         System.out.printf("\nEnter option: ");
         String bs = s.nextLine();
         bs = bs.toUpperCase();
         if(bs.equals("B")){
            double value = myStock.calcCommission() + myStock.calcValue();
            System.out.printf("Cost of Shares: %.2f\n", myStock.calcValue());
            System.out.printf("Commission: %.2f\n", myStock.calcCommission());
            System.out.printf("Total Cost: %.2f\n\n", value);
         }
         else if(bs.equals("S")){
            double value = myStock.calcValue() - myStock.calcCommission();
            System.out.printf("Receipts: %.2f\n", myStock.calcValue());
            System.out.printf("Commission: %.2f\n", myStock.calcCommission());
            System.out.printf("Net Receipts: %.2f\n\n", value);
         }
         else{
            System.out.printf("\nNo action taken\n");
            System.exit(0);
         }
      }
	}
}


/*
                       Valid Test Data      Invalid Test Data
Name of Stock                 name                 

Symbol of Stock               nam                  n

Price of Stock                100                  -1

Number of shares              50                   5

*/