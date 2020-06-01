package com.edu.szu.csse.shiro.mapper;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.szu.csse.shiro.bean.Role;

public interface RoleMapper extends JpaRepository<Role, Integer> {
	Role findByName(String name);
}
