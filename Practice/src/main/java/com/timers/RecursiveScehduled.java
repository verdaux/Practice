package com.timers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RecursiveScehduled
{

	public static void main(String[] args)
	{
		RecursiveScehduled rs = new RecursiveScehduled();
		rs.caller();
	}
	
	public synchronized void caller()
	{
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	    Runnable r = new Runnable() {
	    TesterforTime test = new TesterforTime();
	        @Override
	        public void run() 
	        {
	            test.testCall();
	        }
	    };

	    scheduler.scheduleAtFixedRate(r, 0, 5, TimeUnit.SECONDS);
	}

}
