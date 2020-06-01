package com.edu.szu.csse.shiro.mapper;

import com.edu.szu.csse.shiro.bean.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionMapper extends JpaRepository<Permission, Integer> {
	Permission findByName(String name);
}
