package com.shiro.demo.service;

import com.shiro.demo.entity.UserInfo;

/**
 * created by zlz on 2020/10/22 17:21
 **/
public interface UserService{

    UserInfo findByUsername(String name);
}
