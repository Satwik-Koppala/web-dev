package com.satvik.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.satvik.user.model.User;
import com.satvik.user.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		List<User> User = new ArrayList<User>();
		userRepository.findAll().forEach(User1 -> User.add(User1));
		return User;
	}
	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(User User) {
		userRepository.save(User);
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public void update(User User, int bookid) {
		userRepository.save(User);
	}
}
