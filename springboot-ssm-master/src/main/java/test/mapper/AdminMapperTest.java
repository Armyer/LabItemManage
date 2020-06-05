package test.mapper;

import com.edu.szu.csse.bean.Admin;
import com.edu.szu.csse.mapper.user.AdminMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.ApplicationTests;

/**
 * Created by hasee on 2020/6/5.
 */
public class AdminMapperTest extends ApplicationTests{

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testSearch(){
        Admin admin = new Admin();
        admin.setAdminname("admin");
//        admin.setAdminpassword("admin");
        admin.setAdminpassword("123");

//        int result  = adminMapper.search(admin);
//        System.out.println(result);
    }

}
