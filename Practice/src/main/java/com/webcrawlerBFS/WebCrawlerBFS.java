package com.webcrawlerBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawlerBFS
{
	//create queue and list
	private Queue<String> queue;
	private List<String> discoveredWebsiteList;
	
	public WebCrawlerBFS()
	{
		this.queue = new LinkedList<String>();
		this.discoveredWebsiteList = new ArrayList<String>();
	}
	
	public void discoverWeb(String root)
	{
		this.queue.add(root);
		this.discoveredWebsiteList.add(root);
		
		while(!queue.isEmpty())
		{
			String v = this.queue.remove();
			String rawHTML = readURL(v);
			
			String regex = "https://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(rawHTML);
			while(matcher.find())
			{
				String w = matcher.group();
				
				if(!discoveredWebsiteList.contains(w))
				{
					discoveredWebsiteList.add(w);
					System.out.println("website found:: "+w);
					queue.add(w);
				}
			}
		}
	}
	
	private String readURL(String inp)
	{
		StringBuilder rawHTML = new StringBuilder("");
		try
		{
			URL url = new URL(inp);
			BufferedReader reader  = new BufferedReader(
														new InputStreamReader(
																				url.openStream()
																			)
														);
			
			String line = "";
			
			while((line=reader.readLine())!= null)
			{
				rawHTML.append(line);
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.err.println("Problem with crawling website... ");
		}
		/*finally
		{
			try
			{
				reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}*/
		
		return rawHTML.toString();
	}
}
