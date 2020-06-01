package com.edu.szu.csse.shiro.mapper;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.szu.csse.shiro.bean.ShiroUser;

public interface ShiroUserMapper extends JpaRepository<ShiroUser, Integer> {
	ShiroUser findByUsername(String username);

	ShiroUser findByUsernameAndPassword(String username, String password);
}
