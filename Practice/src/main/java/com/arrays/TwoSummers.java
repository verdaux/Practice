package com.arrays;

public class TwoSummers
{
	public void processArray(Integer[] arr, Integer summedNum)
	{
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = (i+1); j <arr.length; j++)
			{
				if(arr[i]+arr[j] == summedNum)
				{
					System.out.println("The nums are "+arr[i]+" and "+arr[j]);
				}
			}
		}
	}
}
