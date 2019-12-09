package com.boot.renting.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.renting.entity.User;
import com.boot.renting.mapper.UserMapper;
import com.boot.renting.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
}
