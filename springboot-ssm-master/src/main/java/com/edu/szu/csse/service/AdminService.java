package com.edu.szu.csse.service;

import com.edu.szu.csse.bean.Admin;

/**
 * Created by jiang on 2020/6/5.
 */
public interface AdminService {

    /**
     * 实现登陆查询
     * @param adminname
     * @return adminpssword
     */
    Admin login(String adminname,String adminpassword);

}
