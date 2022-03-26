package com.arrays;

import com.util.Employee;

public class TestArrays
{
	public static void main(String[] args)
	{
		int intArray[] = new int[7];
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 17;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
			if(intArray[i]==17)
			{
				System.out.println("17 is at "+i);
			}
		}
		
		Object arr[] = new Object[3];
		String s1 = "random text";
		Integer i1 = 89;
		Employee e1 = new Employee();
		arr[0] = s1;
		arr[1] = i1;
		arr[2] = e1;
		
		for (int i = 0; i < arr.length; i++)
		{
			Object object = arr[i];
			System.out.println("object array has :: "+object.toString());
		}
	}
}
