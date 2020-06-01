package test;

import org.junit.After;
import org.junit.Before;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by jiang on 2020/6/1.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@WebAppConfiguration
public class ApplicationTests {

    @Before
    public void init(){
        System.out.println("------------start test!-------------");
    }



    @After
    public void after(){
        System.out.println("------------test finish!------------");
    }
}
