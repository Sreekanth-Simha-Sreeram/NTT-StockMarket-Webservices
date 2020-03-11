package com.stockmarket.services;

import java.util.List;

import com.stockmarket.model.Company;
import com.stockmarket.model.IPODetails;



public interface AdminService {
	public void createCompany(Company company );
	public boolean deleteCompany(int companyId);
	public Company editCompany(String companyName,int companyId);
	public Company getCompany(String companyName,int companyId);
	public List<Company> viewCompany(Company company);
	Company findCompany(int companyId);
	IPODetails updateIPODetails(int ipoId);
}
