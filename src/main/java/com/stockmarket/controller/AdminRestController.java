package com.stockmarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.stockmarket.model.Company;
import com.stockmarket.model.IPODetails;
import com.stockmarket.services.AdminService;

public class AdminRestController {
	
	
	@PostMapping(value = "/createCompany/")
    public ResponseEntity<?> createCompany(@RequestBody Company company) {
		return null;
	   }
	
	//please follow the mapping as shown above according to the parameters
    public ResponseEntity<?> deleteCompany(@PathVariable ("companyId") int companyId) {
		return null;
	   }
	
	

	
    public ResponseEntity<?> editCompany(@PathVariable ("companyId") int companyId,@PathVariable ("companyname") String companyname) {
		return null;
	   }
	

	
    public ResponseEntity<?> getCompany(@PathVariable ("companyId") int companyId,@PathVariable ("companyName") String companyName){
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
    public ResponseEntity<?> viewCompany(@RequestBody Company company){
		// TODO Auto-generated method stub
		return null;
		}
	
	
	@GetMapping("/findCompany/{companyId}")
    public ResponseEntity<?> findCompany(@PathVariable ("companyId") int companyId){
		// TODO Auto-generated method stub
		return null;
		}
	
	
	@PutMapping( "/updateIPODetails/{ipoId}")
    public ResponseEntity<?> updateIPODetails(@PathVariable ("ipoId") int ipoId) {
		return null;
	   }
}
