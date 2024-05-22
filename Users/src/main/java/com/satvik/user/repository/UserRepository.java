package com.satvik.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.satvik.user.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}