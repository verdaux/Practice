package com.threading;

public class JoinDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new Thread(new JoinTask());
		t1.setName("first thread");
		
		Thread t2 = new Thread(new JoinTask());
		t2.setName("second thread");
		
		Thread t3 = new Thread(new JoinTask());
		t3.setName("third thread");
		
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
		t1.join();
		
		t3.start();
		System.out.println(Thread.currentThread().getName());
		
		t3.join();
		
		t2.start();
		System.out.println(Thread.currentThread().getName());
		
		t2.join();
		
		System.out.println("exiting from current thread..."+Thread.currentThread().getName());
		
	}

}
