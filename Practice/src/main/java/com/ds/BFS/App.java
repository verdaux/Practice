package com.ds.BFS;

public class App
{

	public static void main(String[] args)
	{
		//System.out.println("In main");
		
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		
		v1.addNeighbours(v2);
		v1.addNeighbours(v4);
		v4.addNeighbours(v5);
		v2.addNeighbours(v3);
		
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.bfs(v1);
	}

}
