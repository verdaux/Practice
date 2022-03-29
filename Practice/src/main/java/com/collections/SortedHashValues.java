package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortedHashValues
{
	public static void main(String[] args)   
	{  
		SortedHashValues shv = new SortedHashValues();
		HashMap<Integer, String> hm = shv.hashCreator();
		shv.hashTraverser(hm);
	}
	
	public HashMap<Integer, String> hashCreator()
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(89, "Jon");
		hm.put(10, "Cersei");
		hm.put(7, "Hodor");
		hm.put(34, "Arya");
		hm.put(2, "Sansa");
		hm.put(57, "Jamie");
		return hm;
	}
	
	public void hashTraverser(HashMap<Integer, String> hm)
	{
		Set sets = hm.entrySet();
		Iterator itr = sets.iterator();
		
		while (itr.hasNext())
		{
			Map.Entry<Integer, String> map = (Entry<Integer, String>) itr.next();
			System.out.println("ID:: "+map.getKey()+" Name:: "+map.getValue());
		}
	}
}
