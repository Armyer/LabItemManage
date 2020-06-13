package com.edu.szu.csse.service.impl.user;

import java.util.List;
import java.util.Map;

import com.edu.szu.csse.bean.user.User;
import com.edu.szu.csse.bean.user.UserExample;
import com.edu.szu.csse.mapper.user.UserMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.szu.csse.service.user.UserService;
import com.edu.szu.csse.utils.securty.MD5Utils;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> findAllUser() {
		UserExample userExample = new UserExample();
		List<User> list = userMapper.selectByExample(userExample);
		return list;
	}

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public List<User> getUsers(Map condition) {
		UserExample userExample = new UserExample();
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "username"))) {
			UserExample.Criteria createCriteria = userExample.createCriteria();
			createCriteria.andUsernameLike("%" + MapUtils.getString(condition, "username") + "%");
		}
		List<User> list = userMapper.selectByExample(userExample);
		System.out.println("_____________________________________________");
		return list;
	}

	@Override
	public void deleteUser(int id) {
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User getUser(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public User findUserByUsername(String username) {
		UserExample userExample = new UserExample();
		UserExample.Criteria createCriteria = userExample.createCriteria();
		createCriteria.andUsernameEqualTo(username);

		List<User> users = userMapper.selectByExample(userExample);
		if (CollectionUtils.isEmpty(users)) {
			return null;
		}

		return users.get(0);
	}

	@Override
	public User getUserByUserNameAndPassword(String username, String password) {
		UserExample userExample = new UserExample();
		UserExample.Criteria createCriteria = userExample.createCriteria();
		createCriteria.andUsernameEqualTo(username);
		createCriteria.andPasswordEqualTo(MD5Utils.md5(password));

		List<User> selectByExample = userMapper.selectByExample(userExample);
		if (CollectionUtils.isNotEmpty(selectByExample)) {
			return selectByExample.get(0);
		}

		return null;
	}

	@Override
	public String getDevice_user(String device_id) {
		String userfullname = userMapper.getDevice_user(device_id);
		return userfullname;
	}

}
