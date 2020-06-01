package test.service.impl;

import com.edu.szu.csse.MySpringBootApplication;
import com.edu.szu.csse.bean.user.User;
import com.edu.szu.csse.mapper.user.UserMapper;
import com.edu.szu.csse.service.impl.user.UserServiceImpl;
import com.edu.szu.csse.service.user.UserService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import test.ApplicationTests;

import java.util.List;

/**
 * Created by hasee on 2020/6/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@WebAppConfiguration
public class UserServiceImplTest extends ApplicationTests{
    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceImpl userServiceImpl;


    @Test
    public void testLogin(){

        String name = "jiang";
        User user = userServiceImpl.getUserByUserNameAndPassword("jiang","jiang");
//        User user = userService.findUserByUsername(name);

        System.out.println(user.getUsername());
    }

    @Test
    public void testDeleteUser(){
        int id = 13;
        userService.deleteUser(id);

    }

    @Test
    public void findAllUser(){

        List<User> lists;
        lists = userServiceImpl.findAllUser();
        System.out.println(lists.size());

    }


}
