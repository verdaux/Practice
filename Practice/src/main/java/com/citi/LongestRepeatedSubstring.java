package com.citi;

public class LongestRepeatedSubstring
{

	public static void main(String[] args)
	{
		LongestRepeatedSubstring lrs = new LongestRepeatedSubstring();
		String inputString = "abcabcabcd";
		System.out.println("repeated is "+lrs.stringTraverser(inputString));;
	}
	
	public String stringTraverser(String input)
	{
		String lrs="";
		for (int i = 0; i < input.length(); i++)
		{
			for (int j = i+1; j < input.length(); j++)
			{
				
				String repeatedVal = 
						lcp(input.substring(i,input.length()), input.substring(j, input.length()));
				if(repeatedVal.length() > lrs.length())
				{
					lrs=repeatedVal;
				}
			}
			
		}
		return lrs;
	}
	
	public String lcp(String s1, String s2)
	{
		int n = Math.min(s1.length(),s2.length());
		for (int i = 0; i < n; i++)
		{
			if (s1.charAt(i)!=s2.charAt(i))
			{
				return s1.substring(0,i);
			}
			
		}
		return s1.substring(0,n);
	}
}
