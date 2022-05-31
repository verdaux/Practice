package com.ds.BFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
	private int data;
	private boolean visited;
	private List<Vertex> neighboursList;
	
	
	public Vertex(int data)
	{
		this.data = data;
		this.neighboursList= new ArrayList<>(); //create to avoid null pointer
	}
	public int getData()
	{
		return data;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	public boolean isVisited()
	{
		return visited;
	}
	public void setVisited(boolean visited)
	{
		this.visited = visited;
	}
	public List<Vertex> getNeighboursList()
	{
		return neighboursList;
	}
	public void addNeighbours(Vertex neighbour)
	{
		this.neighboursList.add(neighbour);
	}
	@Override
	public String toString()
	{
		return ""+this.data;
	}
	
}
