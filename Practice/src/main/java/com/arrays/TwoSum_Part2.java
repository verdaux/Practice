package com.arrays;

public class TwoSum_Part2
{

	public static void main(String[] args)
	{
		int arr[] = {0,0,3,4};//{2,7,11,15};
		TwoSum_Part2 ts2 = new TwoSum_Part2();
		
		for (int i : ts2.twoSum(arr,9))
		{
			System.out.println(i);
		}
		

	}

	
	    public int[] twoSum(int[] numbers, int target) 
	    {
	        int[] twoSums = new int[2];
	        /*for(int i = 1; i < numbers.length;i++)
	        {
	            for(int j = 2; j < numbers.length; j++)
	            {
	                if(target!=0 && (numbers[i]+numbers[j] == target))
	                {
	                    twoSums[0] = j;
	                    twoSums[1] = i;
	                    
	                }
	              
	            }
	        }*/
	        if (numbers == null || numbers.length == 0)
	            return null;
	        int i = 0;
	        int j = numbers.length -1;
	        while(i<=j)
	        {
	            int summed = numbers[i] + numbers[j];
	            
	            if(i==j)
            	{
            		System.out.println("here");
            		twoSums[0] = i;
	                twoSums[1] = j+1;
	                return twoSums;
            	}
		             if(summed<target)
	                {
	                    ++i;
	                }
	            	else if(summed>target)
	                {
	                    j--;
	                }
	                
	                else
	                {twoSums[0] = i+1;
	                twoSums[1] = j+1;
	                return twoSums;}
	        }
	        return twoSums;
	    }
	
}
