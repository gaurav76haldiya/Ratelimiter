package com.gaurav.Demo.copy2;

import java.time.Duration;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;

/*
public class ControllerForPost {
	
	private final Bucket bucket;
	private final UserEx u;
	public ControllerForPost() {
		this.u=new UserEx();
		Refill refill=Refill.of(5,Duration.ofMinutes(1));
		 this.bucket=Bucket4j.builder()
				.addLimit(Bandwidth.classic(5, refill))
				.build();
		
	}
	
    @PostMapping("/AddUser")
    public ResponseEntity<String> AddUser(@RequestBody UserEx user){
    	u.list.add(user);
	    if(bucket.tryConsume(1)){
	    	return ResponseEntity.status(HttpStatus.CREATED).body("User Added Successfully");
	    	}
	    System.out.println("number of hits exceeds");
	    return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("Rate limit Exceed");
	    }
}*/