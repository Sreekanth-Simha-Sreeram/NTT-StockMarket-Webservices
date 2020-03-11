package com.stockmarket.Dao;

import com.stockmarket.model.User;

public interface LoginDao {
	public boolean signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public boolean signOut(int userId);

}
