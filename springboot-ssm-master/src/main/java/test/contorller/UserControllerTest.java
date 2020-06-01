package test.contorller;

import com.edu.szu.csse.MySpringBootApplication;
import com.edu.szu.csse.bean.user.User;
import com.edu.szu.csse.controller.UserController;
import com.edu.szu.csse.service.user.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * Created by jiang on 2020/6/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@WebAppConfiguration
//@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void test() throws Exception{
        List<User> lists;
//        lists = userService.findAllUser();
//        System.out.println(lists.size());
//        userController.getUsers();
        MvcResult mvcResult;
        mvcResult = (MvcResult) mockMvc.perform(MockMvcRequestBuilders.get("/user/deleteUser")
                            .param("id","21")
                            .accept(MediaType.TEXT_HTML_VALUE)
                            );
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResolvedException().getMessage();
        System.out.println(content);


    }




}
