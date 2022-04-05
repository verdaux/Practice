package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerSorter
{

	public static void main(String[] args)
	{
		List<Player> footballTeam = new ArrayList<Player>();
	    Player player1 = new Player(59, "John", 20);
	    Player player2 = new Player(67, "Roger", 22);
	    Player player3 = new Player(45, "Steven", 24);
	    footballTeam.add(player1);
	    footballTeam.add(player2);
	    footballTeam.add(player3);

	    
	    System.out.println("----Before ranking-----");
	   printPlayers(footballTeam);
	    Collections.sort( footballTeam);
	    System.out.println("\n ----After ranking-----");
	    printPlayers(footballTeam);

	}
	
	public static void printPlayers(List<Player> footballTeam)
	{
		for (Player player : footballTeam)
		{
			System.out.println(
								player.getRanking() + ","+
								player.getName()+ ","+
								player.getAge()
								);
		}
	}

}
