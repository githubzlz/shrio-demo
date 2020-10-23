package com.shiro.demo.entity;

import lombok.Data;

import java.util.List;

/**
 * created by zlz on 2020/10/22 17:14
 **/
@Data
public class UserInfo {

    private Long id;
    private String name;
    private String pwd;
    private String credentialsSalt;

    private List<SysRole> sysRoles;
}
