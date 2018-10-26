package com.wdq.mic.micstore.mybatis.imple;

import com.wdq.mic.micstore.bean.UserBean;

import java.util.List;

public interface IUserMapper {
    UserBean login(String username,String password);
    void add(UserBean bean);
}
