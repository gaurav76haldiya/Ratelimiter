package com.gaurav.Demo.copy2;

import java.util.HashMap;

import java.util.Map;

public class BucketEx {

	Map<Integer,LeakyBucket> bucket;
	public BucketEx(int id ) 
	{
	bucket =new HashMap<>();
	bucket.put(id,new LeakyBucket(5));
	
	
	}
	 public boolean accessApplication(int id) {
		if(bucket.get(id).grantAcess()) {
			
		System.out.println(Thread.currentThread().getName()+"able to access the application");
		return true;
		}
		
			System.out.println(Thread.currentThread().getName()+"too many request , please try after sometimes");
		return false;
	}
	

}
