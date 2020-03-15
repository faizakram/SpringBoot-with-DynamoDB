package com.example.demo;

public interface UserCrudService {

	User createUser(User user);

	User readUser(String userId);

	void deleteUser(String userId);

	User updateUser(User user);

}
