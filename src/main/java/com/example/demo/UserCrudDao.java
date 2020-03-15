package com.example.demo;

public interface UserCrudDao {

	User createUser(User user);

	User readUser(String userId);

	User updateUser(User user);

	void deleteUser(String userId);

}
