package com.cui.firstdemo.service;

import org.springframework.stereotype.Service;

/**
 * @author cui
 * @since 创建时间：2019/6/22 17:55
 * 切面编程的连接点（JoinPoint）
 */
@Service
public class UserService {
    public String getUserById(Integer id) {
        System.out.println("get....");
        return "user";
    }

    public void deleteUserById(Integer id) {
        System.out.println("delete....");
        int i = 2 / 0;
    }
}
