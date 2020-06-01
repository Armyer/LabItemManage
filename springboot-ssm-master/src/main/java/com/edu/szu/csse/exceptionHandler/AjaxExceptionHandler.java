package com.edu.szu.csse.exceptionHandler;

import javax.servlet.http.HttpServletRequest;

import com.edu.szu.csse.utils.JSONResultUtil;

//@RestControllerAdvice
public class AjaxExceptionHandler {
//	@ExceptionHandler(value = Exception.class)
	public JSONResultUtil defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {

		e.printStackTrace();
		return JSONResultUtil.error(e.getMessage());
	}
}
