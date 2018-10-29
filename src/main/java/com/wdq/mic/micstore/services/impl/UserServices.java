package com.wdq.mic.micstore.services.impl;

import com.wdq.mic.micstore.bean.UserBean;
import com.wdq.mic.micstore.mybatis.imple.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    IUserMapper userMapper;
    public void add(UserBean bean){
        System.out.println(bean.getUsername());
        System.out.println(bean.getPassword());
        System.out.println(bean.getDate());
        userMapper.add(bean);
    }

    public UserBean login(String name,String pasword){

       return userMapper.login(name,pasword);
    }
}
