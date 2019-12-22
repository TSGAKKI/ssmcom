package com.test;
import com.pojo.User;
import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      ApplicationContext context=new ClassPathXmlApplicationContext(
              "applicationContext.xml");
        UserService userService= (UserService) context.getBean("UserService");

        System.out.println(userService.findAll());

    }
}
