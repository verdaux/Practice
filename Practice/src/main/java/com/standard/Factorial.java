package com.standard;

public class Factorial
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println(recursiveFactorial(3));
		} catch (StackOverflowError e)
		{
			e.printStackTrace();
		}
	}
	
	public static int recursiveFactorial(int num) throws StackOverflowError
	{
		if(num == 0)
		{
		return 1;
		}
		
		return num*recursiveFactorial(num -1);
	}
	
	public static int iterativeFactorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		int factorial = 1;
		
		for(int i=1;i<=num;i++)
		{
			factorial *= i;
		}
		
		return factorial;
	}
}
