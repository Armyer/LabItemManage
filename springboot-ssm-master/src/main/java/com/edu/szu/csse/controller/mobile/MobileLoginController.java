package com.edu.szu.csse.controller.mobile;

import javax.servlet.http.HttpSession;

import com.edu.szu.csse.bean.user.Token;
import com.edu.szu.csse.bean.user.User;
import com.edu.szu.csse.service.user.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.szu.csse.utils.JSONResultUtil;

/**
 * 移动端登陆
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/mobile")
public class MobileLoginController {
	private static final Logger logger = LoggerFactory.getLogger(MobileLoginController.class);

	@Autowired
	private TokenService tokenService;

	/**
	 * 处理登陆请求。登陆成功之后返回一个token
	 * 
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping("doLogin")
	@ResponseBody
	public JSONResultUtil doLogin(String username, String password, HttpSession session) {
		if (!username.equals("admin") || !password.equals("admin")) {
			return JSONResultUtil.error("账号或者密码错误");
		}
		logger.info("sessionId -> {}", session.getId());
		session.setAttribute("user", new User());

		Token token = tokenService.addOrUpdateToken(username);
		logger.info("token -> {}", token);
		return new JSONResultUtil<Token>(true, "ok", token);
	}
}
