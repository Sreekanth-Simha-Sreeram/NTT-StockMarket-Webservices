package com.stockmarket.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmarket.Dao.AdminDao;
import com.stockmarket.model.Company;
import com.stockmarket.model.IPODetails;


public class AdminServiceImpl implements AdminService {

	

	public void createCompany(Company company) {
		// TODO Auto-generated method stub
		
	}
	 
	public boolean deleteCompany(int companyId) {
		// TODO Auto-generated method stub
		return false;
	}

	 
	public Company editCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company getCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> viewCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company findCompany(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IPODetails updateIPODetails(int ipoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
