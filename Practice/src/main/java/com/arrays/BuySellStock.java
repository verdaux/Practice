package com.arrays;

public class BuySellStock
{

	public static void main(String[] args)
	{
		int[] pricesOnADay = {1,5,4,7};
		BuySellStock bss = new BuySellStock();
		bss.profitCalculator(pricesOnADay);
	}
	
	public int profitCalculator(int[] prices)
	{
		int maxProfit = 0,totalMaxProfit=0;
		int minVal = Integer.MAX_VALUE;
		int diff = 0;
		for (int i = 0; i < prices.length; i++)
		{
			if (prices[i] < minVal)
			{
				minVal = prices[i];
			}
			else if (prices[i] - minVal > maxProfit)
			{
				maxProfit = prices[i] - minVal;
			}
			
			if(i>0)
			diff=prices[i]-prices[i-1];
			
			if(diff>0)
			{totalMaxProfit += diff;}
			System.out.println("maxProfit in loop:: "+maxProfit);
		}
		System.out.println("totalMaxProfit:: "+totalMaxProfit+"\nmaxProfit:: "+maxProfit);
		return maxProfit;
	}
}
