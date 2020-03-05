/*
Course: ISTE-120
Author: Jim Leone, Rayno Niemi
Day 21 Decisions
Topic: Lab 07 Ex 1
*/
public class Stock  {
	private String name;		//name of company
	private String symbol;	//Symbol of company on Stock Exchange
	private double price;	//price per share
	private int    shares;	//number of shares
   private final double RATE = .01;
   private final double COMMISSION = 500;
	
	/**
		Constructor with name and symbol
	*/
	public Stock(String newName, String newSymbol)	{
		name   = newName;
		symbol = newSymbol;
		price  = 0.0;
		shares = 0;
	}
   public Stock(){
      name   = "";
		symbol = "";
		price  = 0.0;
		shares = 0;
   }
	
	/**
		Get name of stock
		@return name of stock
	*/
	public String getName( )	{
		return name;
	}
	
	/**
		Get symbol of stock
		@return symbol of stock
	*/
	public String getSymbol( )	{
		return symbol;
	}
	
	/**
		Get price of stock
		@return price of stock
	*/
	public double getPrice( )	{
		return price;
	}
	
	/**
		Get number of shares
		@return number of shares
	*/
	public int getShares( )	{
		return shares;
	}
	
	/**
		Set price of shares
		@param newPrice price of shares
	*/
	public void setPrice(double newPrice)	{
      if(newPrice <= 0){
         System.out.println("The price that you entered needs to be greater than 0.0.");
         System.exit(0);
      }
		price = newPrice;
	}
	
	/**
		Set number of shares
		@param newShares number of shares
	*/
	public void setShares(int newShares)	{
      if(newShares < 10 || newShares > 1000){
         System.out.println("The shares that you entered need to be between 10 and 1000.");
         System.exit(0);
      }
		shares = newShares;
	}
   public void setName(String newName)	{
      if(newName.length() < 1){
            System.out.println("The name that you entered needs to be at least one character.");
            System.exit(0);
         }
		name = newName;
	}
   public void setSymbol(String newSymbol)	{
      if(newSymbol.length() < 3 || newSymbol.length() > 6){
         System.out.println("The symbol that you entered needs to be between 3 and 6 characters.");
         System.exit(0);
      }
		symbol = newSymbol;
	}
   
   public double calcValue(){
      return price * shares;
      
   }
   public double calcCommission(){
      if(calcValue()*RATE > COMMISSION ){
         return COMMISSION;
      }
      return calcValue()*RATE;
   }
}