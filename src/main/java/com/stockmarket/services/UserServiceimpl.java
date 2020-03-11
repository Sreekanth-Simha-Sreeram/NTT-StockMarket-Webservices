package com.stockmarket.services;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmarket.Dao.AdminDao;
import com.stockmarket.Dao.UserDao;
import com.stockmarket.model.Chart;
import com.stockmarket.model.Company;
import com.stockmarket.model.User;


public class UserServiceimpl implements UserService {

	
	
	@Transactional
	public User updateProfile(int userID) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Company> searchCompany(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Company> filterCompany(String companyName, String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public Chart GetChart(Company company, String stockExchange, Date fromTime, Date toTime) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Company> DisplayChart(List<Color> color) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean ExportDataFromChart(Chart chart) {
		// TODO Auto-generated method stub
		return false;
	}

}
