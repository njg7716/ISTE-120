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
	
	/**
		Constructor with name and symbol
	*/
	public Stock(String newName, String newSymbol)	{
		name   = newName;
		symbol = newSymbol;
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
		price = newPrice;
	}
	
	/**
		Set number of shares
		@param newShares number of shares
	*/
	public void setShares(int newShares)	{
		shares = newShares;
	}
}