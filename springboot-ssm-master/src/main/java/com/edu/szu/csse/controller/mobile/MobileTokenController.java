package com.edu.szu.csse.controller.mobile;

import com.edu.szu.csse.service.user.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.szu.csse.bean.user.Token;
import com.edu.szu.csse.utils.JSONResultUtil;

@RestController /** 自动返回的是json格式数据 ***/
@RequestMapping("/mobile/token")
public class MobileTokenController {

	private static final Logger logger = LoggerFactory.getLogger(MobileTokenController.class);

	@Autowired
	private TokenService tokenService;

	/**
	 * 验证Token(如果token不存在返回invalidToken，否则返回更新后的token)
	 * 
	 * @param tokenStr
	 * @return
	 */
	@RequestMapping("validateToken")
	public JSONResultUtil<Object> validateToken(String tokenStr) {
		logger.info("tokenStr -> {}", tokenStr);
		Token token = tokenService.updateIfExistsTokenByTokenStr(tokenStr);
		if (token == null) {
			return JSONResultUtil.error("invalidToken");
		}
		return new JSONResultUtil<Object>(true, "", token);
	}
}