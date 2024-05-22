package com.satvik.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satvik.user.model.User;
import com.satvik.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
 
	@GetMapping("/user")
	private List<User> getAllUser() {
		return userService.getAllUser();
	}

	@GetMapping("/user/{userid}")
	private User getUser(@PathVariable("userid") int userid) {
		return userService.getUserById(userid);
	}

	@DeleteMapping("/user/{userid}")
	private void deleteuser(@PathVariable("userid") int userid) {
		userService.delete(userid);
	}

	@PostMapping("/User")
	private int saveuser(@RequestBody User User) { 
		userService.saveOrUpdate(User);
		return User.getUserid();
	}

	@PutMapping("/User")
	private User update(@RequestBody User User) {
		userService.saveOrUpdate(User);
		return User;
	}
}