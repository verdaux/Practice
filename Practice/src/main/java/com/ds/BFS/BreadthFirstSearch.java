package com.ds.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch
{
	public void bfs(Vertex root)
	{
		//System.out.println("in bfs");
		Queue<Vertex> queue = new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex +" ");
			
			for(Vertex v : actualVertex.getNeighboursList())
			{
				if(!v.isVisited())
				{
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
}
