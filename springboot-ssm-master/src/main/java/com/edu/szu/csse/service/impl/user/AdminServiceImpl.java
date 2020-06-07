package com.edu.szu.csse.service.impl.user;

import com.edu.szu.csse.bean.Admin;
import com.edu.szu.csse.bean.AdminExample;
import com.edu.szu.csse.mapper.user.AdminMapper;
import com.edu.szu.csse.service.AdminService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jiang on 2020/6/5.
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Admin login(String adminname, String adminpassword) {

        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria createCriteria = adminExample.createCriteria();
        createCriteria.andAdminnameEqualTo(adminname);
        createCriteria.andAdminpasswordEqualTo(adminpassword);
        List<Admin> selectByExample = adminMapper.selectByExample(adminExample);
        if(CollectionUtils.isNotEmpty(selectByExample)){
            return selectByExample.get(0);
        }
        return null;

    }
}
