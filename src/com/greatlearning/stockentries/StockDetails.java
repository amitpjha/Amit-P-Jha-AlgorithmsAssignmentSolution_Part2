package com.greatlearning.stockentries;

public class StockDetails 
{
	double[] stockPrice ;
	boolean[] stockInsight ;
	public StockDetails( int n)
	{
		stockPrice = new double[n];
		stockInsight = new boolean[n];
		
	}
	
	public void setStockPrice(int i , double price )
	{
		stockPrice[i] = price ;
	}
	public double[] getStockPrice()
	{
		return stockPrice;
	}
	public void setstockInsight(int i , boolean insight)
	{
		stockInsight[i] = insight;
	}
	public boolean[] getstockInsight()
	{
		return stockInsight ;
	}
	public void displayStockPrice()
	{
		for(int i = 0 ; i < stockPrice.length ; i++)
			System.out.print(stockPrice[i] + " ");
		System.out.println();
	}
	
	public  int countOFStockRise()
	{
		int count = 0 ;
		for(int i = 0 ; i < stockInsight.length ; i++)
		{
			if(stockInsight[i] == true)
				count++ ;
		}
		return count ;
	}
	
	public int countOFStockDecline()
	{
		int count = 0 ;
		for(int i = 0 ; i < stockInsight.length ; i++)
		{
			if(stockInsight[i] == false)
				count++ ;
		}
		return count ;
	}
	
	public boolean isStcockPriceFound(double price)
	{
		boolean isFound = false ;
		for(int i = 0 ; i < stockPrice.length ;i++)
		{
			if(price == stockPrice[i])
			{
				isFound = true;
				break ;
			}
		}
		return isFound ;
	}
	public void displayOptions()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-----------------------------------------------");
	}

}
