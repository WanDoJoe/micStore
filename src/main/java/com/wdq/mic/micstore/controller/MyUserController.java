package com.wdq.mic.micstore.controller;

import com.wdq.mic.micstore.bean.UserBean;
import com.wdq.mic.micstore.services.impl.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class MyUserController {

    @Autowired
    UserServices userServices;
    @RequestMapping(value = "/add" ,method=RequestMethod.POST)
    public Object Add(@RequestBody String body){
//        UserBean bean=new UserBean();
//        bean.setId(1);
//        bean.setUsername("admin");
//        bean.setPassword("admin");
//        bean.setDate("0000-00-00");
//        userServices.add(bean);
        return "userServices.add";
    }

    @GetMapping(value = "/login/{username}/{password}")
    public Object login(@PathVariable(value = "username")String username,
                        @PathVariable(value = "password")String password){
        return userServices.login(username,password);

    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Object updata(@RequestBody String body){

        return "";
    }
}
