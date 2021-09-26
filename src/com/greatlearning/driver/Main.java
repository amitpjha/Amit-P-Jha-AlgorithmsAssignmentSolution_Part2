package com.greatlearning.driver;
import com.greatlearning.stockentries.StockDetails;
import com.greatlearning.stockentries.MergeSort;
import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of companies");
		int noOfCompanies = scan.nextInt();
		StockDetails sd = new StockDetails(noOfCompanies);
		String booleanString ;
		for(int i = 0 ; i < noOfCompanies ; i++ )
		{
			System.out.println("Enter current stock price of the company "+(i + 1));
			sd.setStockPrice(i, scan.nextDouble());
			scan.nextLine();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			 booleanString = scan.nextLine();
			if(booleanString.equals("true"))
			{
				sd.setstockInsight(i, true);
				
			}
			else
			{
				sd.setstockInsight(i, false);
			}				
		}
		MergeSort ms = new MergeSort();
		int count ;
		double speicifcStock ;
		boolean isSpecificStockFound;
		while(true)
		{
			sd.displayOptions();
			String option  = scan.nextLine();
			switch(option)
			{  
			    //Case statements  
			   case "0": System.out.println("Exited successfully");
			   break ;
			   case "1": 
				   
				   ms.sort(sd.getStockPrice(), 0, noOfCompanies - 1, true);
				   System.out.println("Stock prices in ascending order are :");
				   sd.displayStockPrice();
				   System.out.println();
			   break;  
			   case "2":
				   ms.sort(sd.getStockPrice(), 0, noOfCompanies - 1, false);
				   System.out.println("Stock prices in descending order are :");
				   sd.displayStockPrice();
				   System.out.println();
			   break;  
			   case "3": 
				   count = 0 ;
				   count = sd.countOFStockRise();
				   System.out.println("Total no of companies whose stock price rose today : " + count);
				   System.out.println();
		       break;  
			   case "4": 
				   count = 0 ;
				   count = sd.countOFStockDecline();
				   System.out.println("Total no of companies whose stock price declined today : " + count);
				   System.out.println();
		       break; 
			   case "5":  
				   System.out.println("enter the key value");
				   speicifcStock =scan.nextDouble();
				   scan.nextLine();
				   isSpecificStockFound = sd.isStcockPriceFound(speicifcStock);
				   if(isSpecificStockFound == true)
					   System.out.println("Stock of value " + speicifcStock + " is present");
				   else 
					   System.out.println("Value not found");
				   System.out.println();
			   break ;

			    //Default case statement  
			   default:System.out.println("Please Enter the correct option from 1 to 6");  
			}
			if(option.equals("0"))
				break ;
		}
		scan.close();
		
	}
    
}
