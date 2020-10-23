package com.shiro.demo.service;

import com.shiro.demo.entity.SysPermission;
import com.shiro.demo.entity.SysRole;
import com.shiro.demo.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * created by zlz on 2020/10/22 17:22
 **/
@Service
public class UserServiceImpl implements UserService{


    @Override
    public UserInfo findByUsername(String name) {

        UserInfo userInfo = new UserInfo();
        userInfo.setName("zlz");
        userInfo.setCredentialsSalt("123");
        userInfo.setPwd("123456");

        SysRole sysRole = new SysRole();
        sysRole.setRole("admin");


        SysPermission sysPermission = new SysPermission();
        sysPermission.setPermission("user:add");
        List<SysPermission> sysPermissions = new ArrayList<>();
        sysPermissions.add(sysPermission);
        sysRole.setSysPermissions(sysPermissions);
        List<SysRole> sysRoles = new ArrayList<>();
        sysRoles.add(sysRole);
        userInfo.setSysRoles(sysRoles);

        if("zlz".equals(name)){
            return userInfo;
        }
        return null;
    }
}
