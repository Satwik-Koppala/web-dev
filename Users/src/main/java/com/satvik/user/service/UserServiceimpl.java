package com.satvik.user.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satvik.user.dao.UserDao;
import com.satvik.user.model.User;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUser() {
		List<User> User = new ArrayList<User>();
		userDao.getAllUser();
		return User;
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public void saveOrUpdate(User User) {
		userDao.saveOrUpdate(User);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public void update(User User, int bookid) {
		userDao.saveOrUpdate(User);
	}
}