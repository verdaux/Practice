package com.citi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestCiti
{
	//String given - print the longest substring without repeating characters
	//example - "abcabcabcd" "abcdabcdabcdf"
	public static void main(String[] args)
	{
		TestCiti tc = new TestCiti();
		String val = "abcabcabcd";
		tc.repeatingVals(val);
		tc.check(val);
	}
	
	public static void check(String val)
	{
		Set<String> tempVal = new TreeSet<String>();
		char[] individualCharsVal = val.toCharArray();
		for (int i = 0; i < individualCharsVal.length; i++)
		{
			System.out.println(individualCharsVal[i]);
			tempVal.add(""+(individualCharsVal[i]));
		}
		
		iterateTreeSetVal(tempVal);
	}
	
	public void repeatingVals(String val)
	{
		
		
		HashMap<String, Integer> counterMap = new HashMap<String, Integer>();
		char arr[] = val.toCharArray();
		for(char counterVals : arr)
		{
			if(counterMap.containsKey(counterVals))
			{
				int count = counterMap.get(counterVals);
				counterMap.put(""+counterVals, count+1);
			}
			else
			{
				counterMap.put(""+counterVals, 1);
			}
		}
		
		System.out.println("valCOunt is :: "+counterMap);
	}
	
	public static String iterateTreeSetVal(Set<String> tempVal)
	{
		for(String newVal : tempVal)
		{
			System.out.println("new temp val is :: "+tempVal);
		}
		return "";
		
	}
	
	
	//1. creat temp variable - letters which are non repeating
	//2. count/size of temp variable
	//3. iterating to look for repetition - using loop
	//4. compare values with the original temp variable's content
	//5. create Stringbuffer variable and append true values at the end
	//6. Break if iteration is false with wrt temp
}
