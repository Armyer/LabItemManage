package com.edu.szu.csse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@SpringBootApplication
@ServletComponentScan("com.edu.szu.csse") // Servlet、Filter、Listener可以直接通过@WebServlet、@WebFilter、@WebListener注解自动注册，无需其他代码。
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.edu.szu.csse")
//@ComponentScan(value = "com.edu.szu.csse")
public class MySpringBootApplication {
	public static void main(String[] args) {
		// 入口运行类
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
