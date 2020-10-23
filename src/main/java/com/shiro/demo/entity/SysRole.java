package com.shiro.demo.entity;

import lombok.Data;

import java.util.List;

/**
 * created by zlz on 2020/10/22 17:25
 **/
@Data
public class SysRole {

    private String role;

    private List<SysPermission> sysPermissions;
}
