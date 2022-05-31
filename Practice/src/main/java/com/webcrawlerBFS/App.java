package com.webcrawlerBFS;

public class App
{

	public static void main(String[] args)
	{
		WebCrawlerBFS wc = new WebCrawlerBFS();
		wc.discoverWeb("https://www.bbc.co.uk");
	}

}
