package com.satvik.user.dao;

import java.util.List;

import com.satvik.user.model.User;

public interface UserDao {
	List<User> getAllUser();

	User getUserById(int id);

	void saveOrUpdate(User User);

	void delete(int id);

	void update(User User, int bookid);
}
