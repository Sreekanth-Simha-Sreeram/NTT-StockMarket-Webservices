package com.stockmarket.Dao;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stockmarket.model.Chart;
import com.stockmarket.model.Company;
import com.stockmarket.model.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	   private SessionFactory sessionFactory;
	
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
