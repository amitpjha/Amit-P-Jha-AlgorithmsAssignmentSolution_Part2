package com.greatlearning.stockentries;

public class MergeSort 
{
	private void descendSorting(final double[] num , final int left , final int main , final int right)
	{
		int list1 = main - left + 1 ;
		int list2 = right - main;
		double[] Left = new double[list1];
		double[] Right = new double[list2];
		for(int a = 0 ; a < list1 ; ++a)
		{
			Left[a] = num[left + a];
		}
		for(int b = 0 ; b < list2 ; ++b)
		{
			Right[b] = num[main + 1 + b];
		}
		int p = 0;
		int q = 0;
		int r = left;
		while(p < list1 && q < list2)
		{
			if(Left[p] > Right[q])
			{
				num[r] = Left[p];
				p++ ;
			}
			else
			{
				num[r] = Right[q];
				q++ ;
			}
			r++ ;
		}
		
		while(p < list1)
		{
			num[r] = Left[p];
			p++ ; r++ ;
		}
		while(q < list2)
		{
			num[r] = Right[q];
			q++ ; r++ ;
		}				
		
	}
	
	private void ascendSorting(final double[] num , final int left , final int main , final int right)
	{
		int list1 = main - left + 1 ;
		int list2 = right - main;
		double[] Left = new double[list1];
		double[] Right = new double[list2];
		for(int a = 0 ; a < list1 ; ++a)
		{
			Left[a] = num[left + a];
		}
		for(int b = 0 ; b < list2 ; ++b)
		{
			Right[b] = num[main + 1 + b];
		}
		int p = 0;
		int q = 0;
		int r = left;
		while(p < list1 && q < list2)
		{
			if(Left[p] <= Right[q])
			{
				num[r] = Left[p];
				p++ ;
			}
			else
			{
				num[r] = Right[q];
				q++ ;
			}
			r++ ;
		}
		
		while(p < list1)
		{
			num[r] = Left[p];
			p++ ; r++ ;
		}
		while(q < list2)
		{
			num[r] = Right[q];
			q++ ; r++ ;
		}				
		
	}

	
	public void sort(final double[] arrNum , final int left , final int right,boolean isAscending)
	{
		if( left < right)
		{
			int middle = (left + right)/2;
			sort(arrNum , left , middle,isAscending);
			sort(arrNum , middle + 1 , right,isAscending);
			if(isAscending == true )
			{
				ascendSorting(arrNum , left , middle , right);
			}
			else
			{
				descendSorting(arrNum , left , middle , right);
			}
		}
	}

}

