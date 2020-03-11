package com.stockmarket.controller;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stockmarket.model.Chart;
import com.stockmarket.model.Company;
import com.stockmarket.model.User;

public class UserRestController {

	
	 @PutMapping("/updateProfile/")
		public ResponseEntity<?> updateProfile(@PathVariable ("userId") int userId) {
				// TODO Auto-generated method stub
			return null;
		}
		 
	
	 
	//please follow the mapping as shown above according to the parameters
     public ResponseEntity<?> searchCompany(@PathVariable ("companyName") String companyName) {
		// TODO Auto-generated method stub
		return null;
	}
	 

	 
	
     public ResponseEntity<?> filterCompany(@PathVariable ("companyName") String companyName,@PathVariable ("companyCode") String companyCode) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	 
	
     public ResponseEntity<?> GetChart(@RequestBody Company company,@PathVariable ("stockExchange")String stockExchange,@PathVariable ("fromTime")Date fromTime,@PathVariable ("toTime")Date toTime)  {
		// TODO Auto-generated method stub
		return null;
	} 
	 
	 
     public ResponseEntity<?> DisplayChart(@RequestBody  List<Color> color)  {
		// TODO Auto-generated method stub
		return null;
	} 

	 
	 
	
		public ResponseEntity<?> ExportDataFromChart(@RequestBody Chart chart) {
				// TODO Auto-generated method stub
			return null;
		}
}
