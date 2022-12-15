package com.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AsciiExample
{

	public static void main(String[] args)
	{
		Integer[] a = new Integer[3];
		a[0] = 65; a[1] = 66; a[2]=67;
		List<Integer> ascii = Arrays.asList(a);
		
		String result = ascii.stream()
						.map(x -> Character.toString(x))
						.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
