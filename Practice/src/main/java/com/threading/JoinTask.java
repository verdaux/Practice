package com.threading;

public class JoinTask implements Runnable
{

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
