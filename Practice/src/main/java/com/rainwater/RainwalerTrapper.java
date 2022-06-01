package com.rainwater;

import java.util.Iterator;

public class RainwalerTrapper
{
	public int calcRainWaterTrapped(int[] heights)
	{
		int inpHeightArrLength = heights.length;
		
		//base case - less that 3 elements in array can't store water
		if(inpHeightArrLength < 3)
		{
			return 0;
		}
		//advanced computing left and right maximums
		int[] leftMax= new int[inpHeightArrLength]; //same number of elements as heights array 
		leftMax[0] = 0;
		
		for(int i=1; i<leftMax.length;i++)
		{
			leftMax[i] = Math.max(leftMax[i-1], heights[i-1]);
		}
		
		int[] rightMax = new int[inpHeightArrLength];
		rightMax[rightMax.length-1] = 0;
		
		for(int i=rightMax.length-2;i>=0;i--)
		{
			rightMax[i] = Math.max(rightMax[i+1], heights[i+1]);
		}
		
		int trapped = 0;
		for(int i = 1; i<inpHeightArrLength-1;i++)
		{
			if((Math.min(leftMax[i], rightMax[i]))-heights[i]>0)
			{
				trapped+=Math.min(leftMax[i], rightMax[i])-heights[i];
			}
		}
		return trapped;
	}
	
	public static void main(String[] args)
	{
		RainwalerTrapper rt = new RainwalerTrapper();
		int[] arr = {1,0,2,1,3,1,2,0,3};
		System.out.println(rt.calcRainWaterTrapped(arr));
	}
}
