package com.main;

import com.arrays.*;
import com.collections.CountWordsInParagraph;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("calling...");
		ArraysOperations dup_finder = new ArraysOperations();
		//dup_finder.findDuplicates();
		CountWordsInParagraph countWords = new CountWordsInParagraph();
		countWords.calculateWords();
	}

}
