package com.luxoft;

import java.util.HashMap;

public class MostFrequentCharacterCounter extends CharacterCounter
{

	private String message;

	public MostFrequentCharacterCounter(String message)
	{
		this.message = message;
	}

	@Override
	public String getCharacter()
	{
		StringBuffer newMessage = new StringBuffer();
		if(message!=null)
		{
			message = message.replaceAll(" ", "").toUpperCase();
		}
		
		
		//split the string message into character array
		//iterate over that character array using for loop
		//initialize int count
		//increment
		
		String[] splittedMessage = message.split("");
		HashMap<String, Integer> finalCounts = new HashMap<String, Integer>();
		String highestCountLetter = "";
		for(String splittedValues : splittedMessage)
		{
			if(finalCounts.containsKey(splittedValues))
			{
				int count = finalCounts.get(splittedValues);
				finalCounts.put(splittedValues, count+1);
			}
			else
			{
				finalCounts.put(splittedValues, 1);
			}
			
		}
		System.out.println("final counts:: "+finalCounts);
		highestCountLetter=finalCounts
				.entrySet()
				.stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
				.get()
				.getKey();
		return highestCountLetter;
		
	}
}
