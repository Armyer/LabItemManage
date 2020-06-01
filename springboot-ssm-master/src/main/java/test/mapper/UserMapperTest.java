package test.mapper;

import com.edu.szu.csse.MySpringBootApplication;
import com.edu.szu.csse.mapper.user.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import test.ApplicationTests;

/**
 * Created by jiang on 2020/6/1.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@WebAppConfiguration
public class UserMapperTest extends ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testDeleteUser(){
        int  id = 13;
        userMapper.deleteByPrimaryKey(id);
        System.out.println("hello");
    }

}
