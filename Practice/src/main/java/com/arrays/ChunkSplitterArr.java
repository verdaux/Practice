package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChunkSplitterArr
{

	public static void main(String[] args)
	{
		int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int splitSize = 3;
		
		List<int[]> list = splitArray(original, splitSize);
		list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
	}
	
	public static List<int[]> splitArray(int[] arrayToSplit, int chunkSize) 
	{
		if(chunkSize<=0){
	        return null;  // just in case :)
	    }
	    // first we have to check if the array can be split in multiple 
	    // arrays of equal 'chunk' size
	    int rest = arrayToSplit.length % chunkSize;  // if rest>0 then our last array will have less elements than the others 
	    // then we check in how many arrays we can split our input array
	    int chunks = arrayToSplit.length / chunkSize + (rest > 0 ? 1 : 0); // we may have to add an additional array for the 'rest'
	    // now we know how many arrays we need and create our result array
		
		List<int[]> splitted = new ArrayList<int[]>();
		//int[] splitArray = new int[chunks];
		
		// we create our resulting arrays by copying the corresponding 
	    // part from the input array. If we have a rest (rest>0), then
	    // the last array will have less elements than the others. This 
	    // needs to be handled separately, so we iterate 1 times less.
		
		for(int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++)
		{
	        // this copies 'chunk' times 'chunkSize' elements into a new array
			splitted.add(Arrays.copyOfRange(arrayToSplit, i * chunkSize, i * chunkSize + chunkSize));
	    }
		
		if(rest > 0){ // only when we have a rest
	        // we copy the remaining elements into the last chunk
			splitted.add(Arrays.copyOfRange(arrayToSplit, (chunks - 1) * chunkSize, (chunks - 1) * chunkSize + rest));
	    }
		
		return splitted;
	}
}
