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
		
		//Get name and symbol
		System.out.print("Enter name of stock: ");
		name = in.nextLine( );
      if(name.length() < 1){
         System.out.println("The name that you entered needs to be at least one character.");
         System.exit(0);
      }
		System.out.print("Enter symbol of stock: ");
		symbol = in.nextLine( );
      if(symbol.length() < 3 || symbol.length() > 6){
         System.out.println("The symbol that you entered needs to be between 3 and 6 characters.");
         System.exit(0);
      }
		
		//Instantiat Stock object with price and symbol
		Stock myStock = new Stock(name, symbol);
		
		//prompt user for price and set it
		System.out.print("Enter price of stock: ");
		price = in.nextDouble( );
      if(price <= 0){
         System.out.println("The price that you entered needs to be greater than 0.0.");
         System.exit(0);
      }
		myStock.setPrice(price);
		
		//prompt user for number of shares and set it
		System.out.print("Enter number of shares: ");
		shares = in.nextInt( );
      if(shares < 10 || shares > 1000){
         System.out.println("The shares that you entered need to be between 10 and 1000.");
         System.exit(0);
      }
		myStock.setShares(shares);
		
		//print  stock info using spaces with each output
		System.out.printf("%nName:   %s%n" ,myStock.getName());
		System.out.printf("Symbol: %s%n"  , myStock.getSymbol());
		System.out.printf("Price:  %.2f%n", myStock.getPrice());
		System.out.printf("Shares: %d%n"  , myStock.getShares());
	}
}


/*
                       Valid Test Data      Invalid Test Data
Name of Stock                 name                 

Symbol of Stock               nam                  n

Price of Stock                100                  -1

Number of shares              50                   5

*/