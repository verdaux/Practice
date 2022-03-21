package com.collections;

import java.util.HashMap;

public class CountWordsInParagraph
{
	public void calculateWords()
	{
		String paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
		String split[] = paragraph.split(" ");
		HashMap<String, Integer> countedMap = new HashMap<String, Integer>();
		
		for (String keyWord : split)
		{
			if (countedMap.containsKey(keyWord))
			{
				int count = countedMap.get(keyWord);
				countedMap.put(keyWord, count + 1);
			}
			else
			{
				countedMap.put(keyWord, 1);
			}
		}
		
		System.out.println("counts are:: \n"+countedMap);
	}
	
	
}
