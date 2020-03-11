package com.stockmarket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stockmarket.model.User;

public class LoginRestController {


	@PostMapping(value = "/signUp/")
    public ResponseEntity<?> signUp(@RequestBody User user) {
		return null;
	   }
	
	
	
	//please follow the mapping as shown above according to the parameters
    public ResponseEntity<?> signIn(@PathVariable ("userName") int userName,@PathVariable("userPassword") int userPassword) {
		return null;
	   }
	
	
	
	
    public ResponseEntity<?> signOut(@PathVariable ("userId") int userid) {
		return null;
	   }
	
}
