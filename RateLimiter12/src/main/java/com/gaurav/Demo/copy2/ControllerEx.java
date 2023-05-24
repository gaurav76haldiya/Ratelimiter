package com.gaurav.Demo.copy2;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEx 
{
	//public  static List<UserEx> list=new ArrayList<>();
	private final UserEx u;
	private final BucketEx bucket;
	     public ControllerEx() {
		    this.u = new UserEx();
			 bucket=new BucketEx(1);
	     }
	     
    
	     
	@SuppressWarnings("unchecked")
	@GetMapping("/getAllUser")
    public ResponseEntity<List<UserEx>> getAllUser() {
	      if(bucket.accessApplication(1)){
		      return ResponseEntity.ok(u.list);
	     }
	     return (ResponseEntity<List<UserEx>>) ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS);
	
}

}

