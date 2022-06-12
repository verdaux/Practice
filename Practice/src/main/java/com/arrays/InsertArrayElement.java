package com.arrays;

public class InsertArrayElement
{
	private int size = 0;
	private Object[] data;
	private int initialCapacity;

	public InsertArrayElement(int initialCapacity)
	{
		this.initialCapacity = initialCapacity;
		data = new Object[initialCapacity];
	}
	
	public static void main(String[] args)
	{
		InsertArrayElement ins = new InsertArrayElement(2);
		ins.addElement("a");
		ins.addElement("c");
		ins.addElement("d");
		ins.printArray();
		
		ins.insert(1, "b");
		ins.printArray();
	}

	public void addElement(String value)
	{
		//check size
		if(size == initialCapacity)
		{resize();}
		
		//add at end
		data[size] = value;
		size++;
	}
	
	public void insert(int index, String value)
	{
		//check size
		if(size == initialCapacity)
		{resize();}
		//copy up
		for(int j=size; j > index; j--)
		{
			data[j] = data[j-1];
		}
		//insert
		data[index] = value;
		size++;
	}
	
	public void resize()
	{
		Object[] newData = new Object[initialCapacity * 2];
		for(int i = 0; i < initialCapacity; i++)
		{
			newData[i] = data[i];
		}
		data = newData;
		initialCapacity = initialCapacity * 2;
	}
	
	public int size()
	{
		return size;
	}
	
	public void printArray()
	{
		for (int i = 0; i < size; i++)
		{
			System.out.println(data[i]);
		}
	}
}
