package com.edu.szu.csse.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.edu.szu.csse.annotation.MyLogAnnotation;
import com.edu.szu.csse.bean.user.User;
import com.edu.szu.csse.utils.DefaultValue;
import com.edu.szu.csse.utils.ValidateCheck;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.edu.szu.csse.service.user.UserService;
import com.edu.szu.csse.utils.JSONResultUtil;
import com.edu.szu.csse.utils.securty.MD5Utils;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	/**
	 * 添加user
	 * 
	 * @param user
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("addUser")
	@ResponseBody
	public JSONResultUtil addUser(User user) {
		user.setCreatetime(new Date());
		logger.info("user -> {}", user);
		userService.addUser(user);
		return JSONResultUtil.ok();
	}

	/**
	 * JSON形式的数据
	 * 
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("addUserJSON")
	@ResponseBody
	public JSONResultUtil doAddUserJSON(@RequestBody User user, HttpServletRequest request) {
		if (user != null && "admin".equals(user.getUsername())) {
			return JSONResultUtil.error("您不能添加管理员用户");
		}

		User findUser = userService.findUserByUsername(user.getUsername());
		if (findUser != null) {
			return JSONResultUtil.error("用户已经存在");
		}

		user.setPassword(MD5Utils.md5(user.getPassword()));// md5加密密码
		if (StringUtils.isBlank(user.getRoles())) {
			user.setRoles("普通用户");
		}

		userService.addUser(user);
		return JSONResultUtil.ok();
	}

	/**
	 * 分页查询user
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("getUsers")
	// @Cacheable(value = "usersCache", keyGenerator = "keyGenerator") //
	// 在redis中开启key为findAllUser开头的存储空间。key和keyGenerator只能使用一个
	@MyLogAnnotation(operateDescription = "分页查询用户")
	@ResponseBody
	public PageInfo<User> getUsers(@RequestParam Map condition) {
		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = Integer.parseInt(MapUtils.getString(condition, "pageNum"));
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = Integer.parseInt(MapUtils.getString(condition, "pageSize"));
		}
		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<User> users = new ArrayList<User>();
		try {
			users = userService.getUsers(condition);
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		return pageInfo;
	}

	/**
	 * 删除user
	 * 
	 * @param user
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("deleteUser")
	@ResponseBody
	public JSONResultUtil deleteUser(int id) {
		userService.deleteUser(id);
		return JSONResultUtil.ok();
	}

	/**
	 * 跳转打修改用户页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("updateUser")
	public String updateUser(int id, ModelMap map) {
		User user = userService.getUser(id);
		map.addAttribute("user", user);
		return "updateUser";
	}

	/**
	 * 添加user
	 * 
	 * @param user
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("doUpdateUser")
	@ResponseBody
	public JSONResultUtil doUpdateUser(User user) {
		logger.info("user -> {}", user);
		userService.updateUser(user);
		return JSONResultUtil.ok();
	}
}