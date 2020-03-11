package com.stockmarket.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmarket.Dao.AdminDao;
import com.stockmarket.Dao.LoginDao;
import com.stockmarket.model.User;
@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	
	
	 @Transactional
	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean signIn(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean signOut(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
