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
		//countWords.calculateWords();
		TwoSummers summing = new TwoSummers();
		Integer A[] = {0, -1, 2, -3, 1};
	      Integer x = -2;
		summing.processArray(A, x);
	}

}
