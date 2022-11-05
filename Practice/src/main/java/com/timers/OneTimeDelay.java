package com.timers;

import java.util.Timer;
import java.util.TimerTask;

public class OneTimeDelay
{
	private Timer timer = new Timer();
	
	public static void main(String[] args)
	{
		OneTimeDelay otd = new OneTimeDelay();
		otd.testCaller();
		
	}
	
	public synchronized void testCaller() {
	    this.timer.cancel(); //this will cancel the current task. if there is no active task, nothing happens
	    this.timer = new Timer();

	    TimerTask action = new TimerTask() {
	        public void run() {
	            TesterforTime test = new TesterforTime();
	            test.testCall();
	            
	            timer.cancel();
	        }

	    };

	    this.timer.schedule(action, 10000); //this starts the task
	    
	}

}
