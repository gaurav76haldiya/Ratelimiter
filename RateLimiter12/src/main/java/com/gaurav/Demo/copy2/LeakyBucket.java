package com.gaurav.Demo.copy2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class LeakyBucket {
	
	// take a blocking Queue
	
	BlockingQueue<Integer> queue;
	
	// create a constructor
	
	public LeakyBucket(int capacity) 
	{
		this.queue=new LinkedBlockingQueue<>(capacity);
		 
	}
	
	public boolean grantAcess() {
		if(queue.remainingCapacity() >0) {
			queue.add(1);
			return true;
		}
		return false;
	}
	
	
	

}
