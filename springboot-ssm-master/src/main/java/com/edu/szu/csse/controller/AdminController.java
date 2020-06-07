package com.edu.szu.csse.controller;

import com.edu.szu.csse.bean.Admin;
import com.edu.szu.csse.service.AdminService;
import com.edu.szu.csse.utils.JSONResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by jiang on 2020/6/5.
 */
@Controller
/** 自动返回的是json格式数据 ***/
@RequestMapping("admin")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    @ResponseBody
    public JSONResultUtil login(Admin admin, Model model, HttpServletRequest request){
//        HttpSession session  =

        logger.info("admin ->"+admin.toString());
        if(adminService.login(admin.getAdminname(),admin.getAdminpassword())!=null){
            model.addAttribute(admin);
            request.getSession(true).setAttribute("admin",admin);
            return JSONResultUtil.ok();
        }
        return JSONResultUtil.error("username or password is error！！");
    }

}
