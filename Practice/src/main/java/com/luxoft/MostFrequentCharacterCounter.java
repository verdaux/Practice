package com.luxoft;

import java.util.HashMap;

public class MostFrequentCharacterCounter extends CharacterCounter
{

	private String message;

	public MostFrequentCharacterCounter(String message)
	{
		message = this.message;
	}

	@Override
	public String getCharacter()
	{
		StringBuffer newMessage = new StringBuffer();
		if(message!=null)
		{
			//replace all whitespaces
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
			highestCountLetter=finalCounts.values().stream().sorted().findFirst().toString();
		}
		
		return highestCountLetter;
		
	}
}
