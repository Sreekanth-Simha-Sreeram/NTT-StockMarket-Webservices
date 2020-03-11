package com.stockmarket.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stockmarket.model.User;
@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	   private SessionFactory sessionFactory;
	
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
