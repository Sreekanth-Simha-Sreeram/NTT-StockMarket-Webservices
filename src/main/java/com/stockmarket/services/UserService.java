package com.stockmarket.services;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import com.stockmarket.model.Chart;
import com.stockmarket.model.Company;
import com.stockmarket.model.User;



public interface UserService {

	 public User updateProfile(int userID);
	 public List<Company> searchCompany(String companyName);
	 public List<Company> filterCompany(String companyName, String companyCode);
	 Chart GetChart(Company company,String stockExchange,Date fromTime,Date toTime);
    List<Company> DisplayChart( List<Color> color);
    boolean ExportDataFromChart(Chart chart);
}
