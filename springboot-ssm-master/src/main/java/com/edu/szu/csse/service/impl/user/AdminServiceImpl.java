package com.edu.szu.csse.service.impl.user;

import com.edu.szu.csse.bean.Admin;
import com.edu.szu.csse.mapper.user.AdminMapper;
import com.edu.szu.csse.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiang on 2020/6/5.
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public int login(Admin admin) {

//        Admin admin = new Admin();
//        admin.setAdminname(adminname);
//        admin.setAdminpassword(adminpassword);
        Admin result  = adminMapper.search(admin);
        if(result!=null){
            return 1;
        }else{
            return 0;
        }
    }
}
