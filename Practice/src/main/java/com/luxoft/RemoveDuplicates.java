package com.luxoft;

import java.util.Arrays;

public class RemoveDuplicates
{

	public static void main(String[] args)
	{
		int arrNew[] = {26,9,7,1,89,7,2,26};
		
		Arrays.sort(arrNew);
		
		int n = duplicateRemover(arrNew, arrNew.length);
		/*
		 * for (int i = 0; i < n; i++) { System.out.print(arrNew[i]+","); }
		 */
	}

	public static int duplicateRemover(int arr[], int n)
	{
		int j=0;
		for (int i = 0; i < n-1; i++)
		{
			if (arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		System.out.println("dup method value for j:: "+j);
		for (int i = 0; i < j; i++)
		{
			System.out.print(arr[i]+",");
		}
		return j;
	}
}
