package com.edu.szu.csse.service.user;

import java.util.List;
import java.util.Map;

import com.edu.szu.csse.bean.user.User;

public interface UserService {

	List<User> findAllUser();

	void addUser(User user);

	List<User> getUsers(Map condition);

	void deleteUser(int id);

	User getUser(int id);

	void updateUser(User user);

	User findUserByUsername(String username);

	User getUserByUserNameAndPassword(String username, String password);

	String getDevice_user(String device_id);
}
