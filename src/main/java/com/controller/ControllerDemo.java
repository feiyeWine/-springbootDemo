package com.controller;


import com.dao.UsersDao;
import com.model.Users;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YR on 2016/3/29.
 */

@Controller
public class ControllerDemo {
    static Logger logger = Logger.getLogger(ControllerDemo.class);


    @RequestMapping("/test")
    public ModelAndView test3(ModelAndView modelAndView){
        System.out.println("第一个test，hello");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @RequestMapping("/test2")
    public String test2(){
        logger.info("这是test2，测试jetbrick");


        return "main";
    }
    @RequestMapping("/testJetbrick")
    public ModelAndView testJetbrick(ModelAndView modelAndView){

        Users user = new Users();
        Users user2 = new Users();
        Users user3 = new Users();
        UsersDao usersDao = new UsersDao();
        List<Users> users = new ArrayList<Users>();

        user.setName("张三");
        user.setAge(22);
        user.setSex("男");
        users.add(user);

        user2.setName("李四");
        user2.setAge(25);
        user2.setSex("男");
        users.add(user2);

        user3.setName("赵六");
        user3.setAge(22);
        user3.setSex("女");
        users.add(user3);

        usersDao.setUsers(users);

        modelAndView.addObject("user",user);
        modelAndView.addObject("users",usersDao);
        modelAndView.setViewName("test");

        return  modelAndView;
    }
}
